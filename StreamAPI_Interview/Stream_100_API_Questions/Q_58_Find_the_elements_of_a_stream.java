package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;

public class Q_58_Find_the_elements_of_a_stream {
    //Find the First Element of a Stream
    public static void main(String args[]){
        List<String> list=Arrays.asList("Alpha","Beta","Gamma");
        list.stream()
        .findFirst().ifPresent(System.out::println);

        list.stream()
        .findAny()
        .ifPresent(System.out::println);
        
    }
}
