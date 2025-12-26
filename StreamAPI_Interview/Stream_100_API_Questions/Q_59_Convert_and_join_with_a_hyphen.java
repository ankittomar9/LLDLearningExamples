package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_59_Convert_and_join_with_a_hyphen {

    //Convert a List of Strings to Uppercase and Join with a Hyphen
    public static void main(String args[]){

        List<String> list =Arrays.asList("java","python","c++");

        String result= list.stream()
        .map(String::toUpperCase)
        .collect(Collectors.joining(" - "));

        System.out.println("Joined uppercase string : \n"+result);
    }
    
}
