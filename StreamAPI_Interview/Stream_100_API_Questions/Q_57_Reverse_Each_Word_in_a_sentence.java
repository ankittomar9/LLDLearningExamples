package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q_57_Reverse_Each_Word_in_a_sentence {
    //Reverse each Word in a Sentence
    public static void main(String args[]){
        String str="Java Streams  are Powerful";

        String reversed =Arrays.stream(str.split(" "))   // this can we used to check palindome
        .map(word->
            new StringBuilder(word)
            .reverse().toString())
            .collect(Collectors.joining(" "));
            System.out.println("Reversed String in Another String : \n\n"+reversed);

    }
    
}
