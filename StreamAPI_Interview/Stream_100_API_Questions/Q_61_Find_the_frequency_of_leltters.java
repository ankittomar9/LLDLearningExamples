package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q_61_Find_the_frequency_of_leltters {
    public static void main(String args[]){
        //61. Find the frequency of each character in a String
        String input="communication";

        Map<Character,Long> result=input.chars()
        .filter(c->c !=' ')
        .mapToObj(c->(char) c)
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("Frequency is \n"+result);

    }
    
}
