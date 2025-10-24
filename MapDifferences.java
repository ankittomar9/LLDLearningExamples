import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
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


/*
 * 
 * Learning Examples for Different Map Implementations in Java
 */