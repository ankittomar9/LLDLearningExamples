package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q_66_Map_Where_Key_String_Value_Vowel_Count {
    //66. Create a Map where the Key is the String and Value is its Vowel Count
    public static void main(String args[]){
    List<String> words=Arrays.asList("Apple","Java","Stream","Interview");

     Map<String ,Long> result=words.stream()
     .collect(Collectors.toMap
        (word->word ,word->word.toLowerCase().chars().filter(
         c->"aeiou".indexOf(c)!=-1).count()));

     System.out.println("Count of vowels in Each words : \n"+result);
    }
}
