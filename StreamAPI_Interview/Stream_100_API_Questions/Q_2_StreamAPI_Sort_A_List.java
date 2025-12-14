package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q_2_StreamAPI_Sort_A_List {
    public static void main(String args[]){
        //Sort a List in Ascending and Descending order
         List<Integer> list=Arrays.asList(4,5,8,4,7,2,6,3,1,4);

         List<Integer> sortedListAsc=list.stream()
         .sorted(Comparator.naturalOrder())
         .collect(Collectors.toList());

         System.out.println("Sorted List  in natural order\n " +sortedListAsc);
         System.out.println("\n -------------------------- ");

         List<Integer> sortedListDesc=list.stream()      
         .sorted(Comparator.reverseOrder())
         .collect(Collectors.toList());
         System.out.println("Sorted List  in Reverse order\n " +sortedListDesc);
       
         
        
    }
}

