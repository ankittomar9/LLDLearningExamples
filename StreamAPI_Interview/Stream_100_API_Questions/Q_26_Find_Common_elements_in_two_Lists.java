package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_26_Find_Common_elements_in_two_Lists {
    public static void main(String args[]){
        // Find Common elements in the given 2 List
         List<Integer> list= Arrays.asList(1,2,3,4,5);
         List<Integer> list2= Arrays.asList(3,4,5,6,7);

         List<Integer> CommonList=list.stream()
         .filter(list2::contains)
         .collect(Collectors.toList());

         System.out.println(CommonList);

       

    }
    
}
