package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q_28_Calculate_the_Sum_of_Squares_of_Even_Odd_Single_pipeline {
    
    public static void main(String args[]){
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);

        Map<Boolean,Integer> Separated_Sum=list.stream()
        .collect(Collectors.partitioningBy(
            n->n%2==0,
            Collectors.summingInt(n->n*n)
        ));

        System.out.println("Even Odd "+Separated_Sum);
         System.out.println("Even Sum : "+Separated_Sum.get(true));
          System.out.println("Odd Sum : "+Separated_Sum.get(false));

        
    }
}
