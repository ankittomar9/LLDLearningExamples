package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.stream.IntStream;

public class Q_74_Count_Factors_of_a_given_integer{
    public static void main(String args[]){
        int val=24;
        long factorCount=IntStream.rangeClosed(1, val)
        .filter(i-> val % i==0)
        .count();

        System.out.println("Count of Factors of val : \n"+factorCount);
       
    }
    
}
