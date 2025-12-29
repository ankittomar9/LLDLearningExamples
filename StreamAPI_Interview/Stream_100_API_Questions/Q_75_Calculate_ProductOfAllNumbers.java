package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;

public class Q_75_Calculate_ProductOfAllNumbers {
    public static void main(String args[]){
        List<Integer> numbers=Arrays.asList(1,2,3,4,5);
        int product =numbers.stream()
        .reduce(1, (a,b)->a*b);

        System.out.println("Product of All numbers in List is \n"+product);
    }
    
}
