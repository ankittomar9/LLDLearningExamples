That's a great set of Core Java interview questions covering OOPs, Collections, and Concurrency! I'll provide detailed answers with explanations and code examples for each of the five points.

1. Explain difference between HashMap, LinkedHashMap and TreeMap.

Feature	HashMap	LinkedHashMap	TreeMap
Order	No guaranteed order. Order changes over time.	Maintains insertion order. Iteration order is the order in which keys were inserted.	Natural or custom sorted order of keys. Iteration order is predictable (ascending or based on a provided Comparator).
Null Keys/Values	Allows one null key and multiple null values.	Allows one null key and multiple null values.	Does NOT allow null keys. Allows multiple null values.
Underlying Data Structure	Array of buckets (nodes). Uses hashing for efficient retrieval.	Array of buckets (nodes) with a doubly-linked list running through all its entries.	Red-Black Tree (a self-balancing binary search tree).
Performance	$O(1)$ for get() and put() (average case). Fastest for basic operations.	$O(1)$ for get() and put() (average case). Iteration is slightly faster than HashMap.	$O(\log n)$ for get() and put(). Slower than HashMap and LinkedHashMap.
Use Case	When fast lookups are crucial and order does not matter.	When you need the insertion order to be maintained (e.g., implementing an LRU cache).	When you need the keys to be sorted.
💡 Example (Order)
Java

import java.util.*;
public class MapDifferences {
    public static void main(String[] args) {
        // 1. HashMap: No guaranteed order
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);
        System.out.println("HashMap: " + hashMap); // Output order is unpredictable (e.g., {Banana=2, Apple=1, Cherry=3})
// 2. LinkedHashMap: Insertion order is maintained
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 1);
        linkedHashMap.put("Banana", 2);
        linkedHashMap.put("Cherry", 3);
        System.out.println("LinkedHashMap: " + linkedHashMap); // Output: {Apple=1, Banana=2, Cherry=3}
// 3. TreeMap: Sorted order by key (A-Z for String)
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Cherry", 3);
        System.out.println("TreeMap: " + treeMap); // Output: {Apple=1, Banana=2, Cherry=3}
    }
}
