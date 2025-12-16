package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_23_Reverse_Each_String_In_List {
    //Reverse_Each_String_In_List 
    public static void main(String args[]){
        
        List<String> words=Arrays.asList("Hello","World","in","Java");
   
        System.out.println("original List : \n"+ words);

        List<String> reversedWords=words.stream()
        .map(word-> new StringBuilder(word).reverse().toString())
        .collect(Collectors.toList());

        System.out.println("New Reversed words : \n" +reversedWords);
   
   
    }
    
}
