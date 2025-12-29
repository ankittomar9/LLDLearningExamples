package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.stream.IntStream;

public class Q_72_Prime_number_Check {
    public static void main(String args[]){
      //72. Check if a Number is Prime
        int num=29;
        int num1=10;
        boolean isPrime= num > 1 && IntStream
        .rangeClosed(2, (int)Math.sqrt(num))
        .noneMatch(i->num%i==0);
        System.out.println("Is num prime \n"+isPrime);

          boolean isPrime1= num1 > 1 && IntStream
          .rangeClosed(2, (int)Math.sqrt(num1))
        .noneMatch(i->num1 % i==0);
        System.out.println("Is num1 prime \n"+isPrime1);



    }
    
}
