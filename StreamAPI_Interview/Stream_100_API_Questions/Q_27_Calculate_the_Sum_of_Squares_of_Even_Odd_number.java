package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;

public class Q_27_Calculate_the_Sum_of_Squares_of_Even_Odd_number {
    public static void main(String args[]){

        List<Integer> list=Arrays.asList(1,2,3,4,5,6);

        int even_Sum =list.stream()
        .filter(n->n%2==0)
        .mapToInt(n->n*n)
        .sum();
        System.out.println("sum of Squares of Even Number : \n" +even_Sum);
        // Output is 56 (2*2 +4*4 +6*6 =4+16+36 = 56)


         int odd_Sum =list.stream()
        .filter(n->n%2!=0)
        .mapToInt(n->n*n)
        .sum();
        System.out.println("sum of Squares of Odd Number : \n" +odd_Sum);
        // // Output is 35 (1*1 + 3*3 + 5*5 = 1+9+25= 35)

        // Can we perform the above Odd Even operation in a Single pipeline
        


    }
    
}
