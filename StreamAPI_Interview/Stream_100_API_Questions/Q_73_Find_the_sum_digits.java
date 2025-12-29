package StreamAPI_Interview.Stream_100_API_Questions;

public class Q_73_Find_the_sum_digits {
    public static void main(String args[]){
       int number=12345;
       int sum=String.valueOf(number).chars()
       .map(Character::getNumericValue) 
       .sum();

       System.out.println("Sum of number is \n"+sum);
    }

}
