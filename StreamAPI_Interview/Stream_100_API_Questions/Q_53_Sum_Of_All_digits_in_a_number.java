package StreamAPI_Interview.Stream_100_API_Questions;

public class Q_53_Sum_Of_All_digits_in_a_number {
        public static void main(String args[]){
            int num=12345;

            int sum=String.valueOf(num).chars()
            .map(Character::getNumericValue)
            .sum();

            System.out.println("Sum of digits is "+sum);

        }

}
