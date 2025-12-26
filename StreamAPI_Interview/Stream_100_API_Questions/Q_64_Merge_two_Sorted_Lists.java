package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q_64_Merge_two_Sorted_Lists {
    public static void main(String args[]){
        //64. Merge two sorted Lists into a single sorted Stream
        List<Integer> list1=Arrays.asList(1,3,5,7);
        List<Integer> list2=Arrays.asList(2,4,6,8);
           System.out.println("original List1 : \n"+list1);
             System.out.println("original List2 : \n"+list2);

        List<Integer> combinedList=Stream.concat(list1.stream(), list2.stream())
        .sorted()
        .collect(Collectors.toList());

        System.out.println("\nmerged list is : \n"+combinedList);
        
    }
}
