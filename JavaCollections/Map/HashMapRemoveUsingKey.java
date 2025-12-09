package JavaCollections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapRemoveUsingKey {
    public static void main(String args[]){
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        map.put(4,40);
        map.put(5,50);

        System.out.println("Hashmap before removed Using Key" +map);
        map.remove(4);
        System.out.println("Hashmap value removed Using Key" +map);

    }
    
}
