package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;

public class Q_63_Check_If_List_AlphaNumeric_characters {
    
    public static void main(String args[]){
        //63. Check if a List of Strings contains only alphanumeric characters
        List<String> inputs=Arrays.asList("Java21", "Streams", "1234");

        boolean isAlphaNumeric=inputs.stream()
        .allMatch(str->str.chars().allMatch(Character::isLetterOrDigit));

        System.out.println("alphanumeric characters : \n"+isAlphaNumeric);
    }
}
