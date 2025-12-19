package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.Comparator;

public class Q_33_Find_Longest_Word_in_Sentence {
    // Find the Longest Word In a Given Sentence
    public static void main(String args[]){
       String GivenSentence="I am Software Development Engineer";

        String myResult  = Arrays.stream(GivenSentence.split(" "))   // converting here cannot direclty use stream
        .max(Comparator.comparingInt(String::length))
        .orElse(null);

        System.out.println("Longest Word in Sentence is : \n"+myResult);

        
    }
    
}
