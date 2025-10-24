# Map Implementations in Java

## 1. Differences between HashMap, LinkedHashMap and TreeMap

| Feature | HashMap | LinkedHashMap | TreeMap |
|---------|---------|---------------|---------|
| Order | No guaranteed order. Order changes over time. | Maintains insertion order. | Natural or custom sorted order of keys. |
| Null Keys/Values | Allows one null key and multiple null values. | Allows one null key and multiple null values. | Does NOT allow null keys. Allows multiple null values. |
| Underlying Data Structure | Array of buckets (nodes). Uses hashing. | Array of buckets with doubly-linked list. | Red-Black Tree (self-balancing BST). |
| Performance | O(1) for get/put (average case). Fastest for basic operations. | O(1) for get/put. Better iteration performance. | O(log n) for get/put. Slower than HashMap. |
| Use Case | Fast lookups where order doesn't matter. | When insertion order matters (e.g., LRU cache). | When keys need to be sorted. |

## Example Code

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

## 2. How does ConcurrentHashMap achieve thread safety?