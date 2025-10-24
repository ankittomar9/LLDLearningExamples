# Understanding Map Implementations in Java

## Differences between HashMap, LinkedHashMap and TreeMap

### Key Characteristics Comparison

| Characteristic | HashMap | LinkedHashMap | TreeMap |
|---------------|---------|---------------|---------|
| Ordering | No guaranteed order | Maintains insertion order | Sorted by natural order of keys |
| Performance (get/put) | O(1) average | O(1) average | O(log n) |
| Null values | One null key, multiple null values | One null key, multiple null values | No null keys allowed |
| Memory overhead | Low | Medium (extra linked list) | High (tree structure) |
| Implementation | Hash table | Hash table + Doubly-linked list | Red-black tree |

### Use Cases

| Map Type | Best Used When |
|----------|---------------|
| HashMap | • Need fastest possible lookups<br>• Don't care about order<br>• Memory constraints are important |
| LinkedHashMap | • Need to maintain insertion order<br>• Implementing LRU caches<br>• Predictable iteration needed |
| TreeMap | • Keys must be sorted<br>• Need to find closest matches<br>• Range queries are required |

### Code Example

```java
import java.util.*;

public class MapDifferences {
    public static void main(String[] args) {
        // 1. HashMap: No guaranteed order
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);
        System.out.println("HashMap: " + hashMap); 
        // Output order is unpredictable

        // 2. LinkedHashMap: Insertion order is maintained
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 1);
        linkedHashMap.put("Banana", 2);
        linkedHashMap.put("Cherry", 3);
        System.out.println("LinkedHashMap: " + linkedHashMap); 
        // Output: {Apple=1, Banana=2, Cherry=3}

        // 3. TreeMap: Sorted order by key
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Cherry", 3);
        System.out.println("TreeMap: " + treeMap); 
        // Output: {Apple=1, Banana=2, Cherry=3}
    }
}
```

### Performance Characteristics

| Operation | HashMap | LinkedHashMap | TreeMap |
|-----------|---------|---------------|---------|
| get() | O(1) | O(1) | O(log n) |
| put() | O(1) | O(1) | O(log n) |
| remove() | O(1) | O(1) | O(log n) |
| contains() | O(1) | O(1) | O(log n) |
| iterate | O(n) | O(n) | O(n) |

## 2. How does ConcurrentHashMap achieve thread safety?