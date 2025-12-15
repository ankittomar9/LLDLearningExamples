package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;

public class Q_18_Calculate_number_average_from_list {
    public static void main(String args[]){
        // Calculate average of the numbers of a list

        List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
          System.out.println("Original: "+numbers);

        double average =numbers.stream()
        .mapToInt(Integer::intValue)
        .average()
        .orElse(0.0);

        System.out.println("Average is : "+average);
        




    }

    
}
