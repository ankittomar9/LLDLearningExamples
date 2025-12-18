package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q_29_Separate_Palindromic_and_NonPalindomic_Strings {
    //Separate palindromes with Non Palindromes Using Map
    public static void main(String args[]){
        List<String> myStrings=Arrays.asList("naman","aman","nitin"
        ,"jatin","level","travel"); 

        Map<Boolean,List<String>> SeparationVariable=myStrings.stream()
        .collect(Collectors.partitioningBy(
            // this is our palindromic logic check
            n->n.equals(new StringBuilder(n)
            .reverse().toString()
    )));

        System.out.println("Separated palindromes are \n"+ SeparationVariable);



        
    }
    
}
