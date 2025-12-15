package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Q_20_Filter_List_Even_Odd_By_Partition {
    public static void main(String args[]){
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Original List \n"+list);

      // For this partition we need a Map
      Map<Boolean,List<Integer>>map=list.stream()
      .collect(Collectors.partitioningBy(n->n%2==0));

      System.out.println("Partitioned List \n"+map);






    }
    
}
