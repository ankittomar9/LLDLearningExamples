package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;

public class Q_7_Sum_The_Numbers_Given_List {
    public static void main(String args[]){
        //Sum of all the numbers in a given List 
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);

        int sum=list.stream()
        .mapToInt(Integer::intValue)
        .sum();

        //   double sum=list.stream()  why this doesn't work because think
        // .mapToDouble(Double::doubleValue)
        // .sum();

        
        System.out.println("Sum of Numbers in List is : "+sum);
    }
    
}
