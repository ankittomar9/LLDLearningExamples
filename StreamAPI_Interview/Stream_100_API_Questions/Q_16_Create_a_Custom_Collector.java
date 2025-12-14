package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Q_16_Create_a_Custom_Collector {
    public static void main(String args[]){
        List<String> list = Arrays.asList("Artificial", "Intelligence", "Engineering", "Learning");
        String joined = list.stream().collect(Collectors.joining(", "));
        System.out.println("String joined using : " + joined);
    }
}


