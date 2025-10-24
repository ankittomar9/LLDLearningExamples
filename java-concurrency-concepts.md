# Java Concurrency Concepts Guide

## Thread Safety in Java Collections

### 1. Collections.synchronizedXXX Wrappers

These wrapper classes provide thread safety through synchronized methods:

- **Mechanism**: Wraps standard collections with synchronized public methods
- **Thread Safety**: Only one thread can execute any method at a time
- **Performance**: Poor scaling under high contention due to global lock
- **Iteration**: Requires explicit synchronization

```java
List<String> nonThreadSafeList = new ArrayList<>();
List<String> threadSafeList = Collections.synchronizedList(nonThreadSafeList);

// Iteration must be manually synchronized
synchronized (threadSafeList) {
    for (String s : threadSafeList) {
        System.out.println(s);
    }
}
```

### 2. Concurrent Collections

Modern thread-safe collections from java.util.concurrent package:

- **Mechanism**: Uses advanced locking (Lock Striping, CAS operations)
- **Thread Safety**: High thread safety with better performance
- **Performance**: Excellent scaling and concurrency
- **Iteration**: Weakly consistent, no explicit synchronization needed

```java
Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();
concurrentMap.put("A", 1);
concurrentMap.put("B", 2);

// No external synchronization needed
for (Map.Entry<String, Integer> entry : concurrentMap.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

## Creating Immutable Classes

### Rules for Immutability

1. Declare class as final
2. Make fields private and final
3. No setter methods
4. Initialize via constructor
5. Handle mutable object references carefully

```java
public final class ImmutablePerson {
    private final String name;
    private final int age;
    private final Date dateOfBirth;

    public ImmutablePerson(String name, int age, Date dateOfBirth) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = new Date(dateOfBirth.getTime()); // Deep copy
    }

    public Date getDateOfBirth() {
        return new Date(dateOfBirth.getTime()); // Return copy
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}
```

## Producer-Consumer Pattern

### Implementation using BlockingQueue

```java
public class ProducerConsumerDemo {
    private static final BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(10);

    static class Producer implements Runnable {
        public void run() {
            try {
                for (int i = 0; i < 20; i++) {
                    buffer.put(i);  // Blocks if full
                    System.out.println("Produced: " + i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static class Consumer implements Runnable {
        public void run() {
            try {
                for (int i = 0; i < 20; i++) {
                    int value = buffer.take();  // Blocks if empty
                    System.out.println("Consumed: " + value);
                    Thread.sleep(300);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
```

## Comparing Concurrency Frameworks

### ExecutorService vs ForkJoinPool vs CompletableFuture

| Feature | ExecutorService | ForkJoinPool | CompletableFuture |
|---------|----------------|--------------|-------------------|
| Purpose | General task execution | Divide-and-conquer tasks | Async task composition |
| Model | Thread pool management | Work-stealing algorithm | Non-blocking pipeline |
| Best For | I/O-bound tasks | CPU-bound recursive tasks | Async task chains |

### Example Usage

```java
// ExecutorService
ExecutorService executor = Executors.newFixedThreadPool(5);
Future<String> future = executor.submit(() -> "Task Result");

// ForkJoinPool
ForkJoinPool pool = new ForkJoinPool();
// pool.invoke(new MyRecursiveTask(data));

// CompletableFuture
CompletableFuture<String> future = CompletableFuture
    .supplyAsync(() -> "Hello")
    .thenApply(result -> result + " World")
    .thenAccept(System.out::println);
```
