package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q_21_Find_the_given_Nth_largest_element {
    public static void main(String args[]){
        List<Integer> list=Arrays.asList(10,20,50,40,30);
        //Here if n=3 so the  3rd largest element we have to find
         System.out.println("Original List \n"+list);

        int nThLargestNumber=list.stream()
        .sorted(Comparator.reverseOrder())
        .skip(2) // skips first two values
        .findFirst()
        .orElseThrow();
        
        System.out.println("3rd largest number is \n "+nThLargestNumber);


        

    }
    
}
