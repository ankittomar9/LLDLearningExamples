package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;

public class Q_14_Find_the_longest_string_in_given_string_using_reduce {
    public static void main(String args[]){
        List<String> list=Arrays.asList("Software", "Developer", "Engineering", "Learning");

        String longest_word=list.stream()
        .reduce((s1, s2)->s1.length() > s2.length() ? s1:s2)
        .orElse("List is Empty");
   
         System.out.println("The Longest Word is: " + longest_word);

  
  
  
    }
    
}
