package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;

public class Q_65_Find_second_smallest_array_element {
    public static void main(String args[]){
        // Find the Second Smallest Element in an Array
        int numbers[]={5,2,3,8,2,9,1};
        
        int second_smallest=Arrays.stream(numbers)
        .distinct()
        .sorted()
        .skip(1)
        .findFirst()
        .orElseThrow();

        System.out.println("Second smallest element is \n"+second_smallest);


    }
}
