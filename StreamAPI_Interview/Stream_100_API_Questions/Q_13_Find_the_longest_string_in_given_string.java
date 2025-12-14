package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q_13_Find_the_longest_string_in_given_string {
    public static void main(String args[]){

    // Longest String in a Given String  //using Comparator
     
    List<String> words=Arrays.asList("Software","Developer",
                                    "Engineering","Learning");


    String longestWord=words.stream()
    .max(Comparator.comparingInt(String::length))
    .orElse("List is Empty");


    System.out.println(" Max length word : "+longestWord);







    }

    
}

