package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;

public class Q_36_ReduceAndConcatenateStrings {
    public static void main(String args[]){
        // Concatenate strings in reverse order using reduce.
 
        List<String> myList=Arrays.asList("?","I","am","Software","Engineer");

        String resultString=myList.stream()
        .reduce((w1,w2)->w2 + " "+ w1)
        .orElse("");

        System.out.println("Reversed and Concatenated \n " +resultString);


 


    }
}
