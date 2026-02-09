package JavaCollections.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Q_4_HashMapAndConcurrency {
    public static void main(String[] args) {

        // HashMap - fast but unsafe in multi-thread
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);

        // Hashtable - safe but slow
        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Banana", 2);  // null key/value → NullPointerException  (comment fixed)

        // ConcurrentHashMap - best of both worlds
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("Cherry", 3);
        concurrentMap.put(null, 4); // value can be null → allowed

        // Just to prove it runs
        System.out.println("HashMap:     " + hashMap);
        System.out.println("Hashtable:   " + hashtable);
        System.out.println("Concurrent:  " + concurrentMap);
    }
}