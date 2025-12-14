package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.Optional;

public class Q_5_StreamAPI_Find_last_Word_in_String {
    public static void main(String args[]){
        //Find last Word in String
        String s1="I am a engineer software";
        String[] words=s1.split(" ");

        System.out.println(s1);
        System.out.println(Arrays.toString(words));
        
        // Optional Optional<String> lastWordOptional=stream.words   <- why not this
        Optional<String> lastWordOptional=Arrays.stream(words)
        .reduce((first,second)->second);                     // what is happening here

        String lastword=lastWordOptional.orElse("String is empty");
        System.out.println("The Last Word is: " + lastword);




    }
    
}
