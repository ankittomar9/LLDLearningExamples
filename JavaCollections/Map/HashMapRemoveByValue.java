package JavaCollections.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapRemoveByValue {
    public static void main(String args[]){
     Map<Integer,Integer> map=new HashMap<>();
        map.put(1,10);    map.put(2,20);  map.put(3,30);
        map.put(4,40);    map.put(5,40);   map.put(6,60); 
                                     map.put(7,40);
        int remove_value=40;
    //To remove the values in HashMap using value
    //we need to find all the remove value which is 40 in our case in example
    // as we see value 40 appears 3 times
    // Here i used for each Loop
    System.out.println("Before Removed HashMap\n"+map);
        Set<Integer> keysToRemove=new HashSet<>();
        for(Map.Entry<Integer,Integer>entry : map.entrySet() ){
            if(entry.getValue().equals(remove_value)){
                keysToRemove.add(entry.getKey());
            }
        }

        for(Integer key: keysToRemove){
            map.remove(key);
        }

    System.out.println("After Removed HashMap\n"+map);    



    }
    
}
