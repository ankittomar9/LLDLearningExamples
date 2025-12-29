package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.Comparator;

public class Q_77_Find_The_Second_largest_element_in_Array {
    public static void main(String args[]){
        int[] arr={10,5,8,20,20,15};
        
        int secondLargest= Arrays.stream(arr)
        .distinct()
        .boxed()
        .sorted(Comparator.reverseOrder())
        .skip(1) 
        .findFirst()
        .orElse(-1);

        System.out.println("Second largest element is : \n"+secondLargest);
    }
    
}
