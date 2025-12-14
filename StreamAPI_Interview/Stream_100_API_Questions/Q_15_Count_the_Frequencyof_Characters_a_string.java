package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Map;
import java.util.stream.Collectors;

public class Q_15_Count_the_Frequencyof_Characters_a_string {
    public static void main(String args[]){
        String myWord="Bookkeeper";

    Map<Character,Long> frequency=myWord.chars()
    .mapToObj(c->(char) c)
    .collect(Collectors.groupingBy(c-> c, Collectors.counting()));

    System.out.println(frequency+"\n");



    }
    
}

