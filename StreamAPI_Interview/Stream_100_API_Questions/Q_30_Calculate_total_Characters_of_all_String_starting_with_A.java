package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q_30_Calculate_total_Characters_of_all_String_starting_with_A {
    public static void main(String args[]){
    List<String> list =Arrays.asList("Apple","Banana","Apricot","Avocado","Cherry","Afruit","A_Not");
    
    Map<Integer,List<String>> my_Filtered_List=list.stream()
    .filter(s->s.startsWith("A"))
    .collect(Collectors.groupingBy(String::length));

    System.out.println("Grouped Length  : " +my_Filtered_List );

    }
}
