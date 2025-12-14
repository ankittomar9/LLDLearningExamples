package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q_10_Find_Duplicates_in_List {
    public static void main(String args[]){
      //Filter the List for which duplicate elements appear
      // for example 4 doesn't repeat so not included 
        
     List<Integer> list=Arrays.asList(1,1,2,3,3,3,4,5,5,6,8,7,8,8,9,1);

       Set<Integer> uniqueElements =new HashSet<>();

       Set<Integer> duplicates=list.stream() // pipeline open
       .filter(n -> !uniqueElements.add(n)) // filter based on condition
       .collect(Collectors.toSet());        // add and store them

        System.out.println("Original List \n"+ list);
       System.out.println("Unique Elements \n"+ duplicates);
        
    }
    
}
