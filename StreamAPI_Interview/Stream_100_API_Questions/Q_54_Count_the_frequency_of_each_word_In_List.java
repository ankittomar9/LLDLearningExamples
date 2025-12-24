package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q_54_Count_the_frequency_of_each_word_In_List {
    public static void main(String args[]){
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");

        Map<String,Long> countMap=words.stream()
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("Frequency is \n"+countMap);

    }
    
}
