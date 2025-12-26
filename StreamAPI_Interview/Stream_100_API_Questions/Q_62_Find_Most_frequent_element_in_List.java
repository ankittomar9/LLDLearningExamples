package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q_62_Find_Most_frequent_element_in_List {
    public static void main(String args[]){
        //62. Find the most frequent element in a List
        List<String> fruits=Arrays.asList("apple", "apple", "banana",
         "cherry", "banana", "apple");

        String mostFrequent=fruits.stream()
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        .entrySet().stream()
        .max(Map.Entry.comparingByValue())
        .map(Map.Entry::getKey)
        .orElse("N/A");

        System.out.println("Most Frequent Element is : "+mostFrequent);

    }
}
