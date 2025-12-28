package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.stream.LongStream;

public class Q_71_Factorial_Of_a_Number {
    public static void main(String args[]){
        int n=5;
        long factorial=LongStream.rangeClosed(1, n)
        .reduce(1, (a,b)->a*b);

        System.out.println("Factorial is : \n"+factorial);
    }
    


}
