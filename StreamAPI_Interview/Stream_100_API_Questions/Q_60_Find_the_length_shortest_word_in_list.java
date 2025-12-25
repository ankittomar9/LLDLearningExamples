package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;

public class Q_60_Find_the_length_shortest_word_in_list {

    public static void main(String args[]){

        // Find the Length of the Shortest Word in a List
        List<String> list=Arrays.asList("Apple","Go","java","Stream");

        int minLength=list.stream()
        .mapToInt(String::length)
        .min()
        .orElse(0);

        System.out.println("minimum length word is : \n"+ minLength);

    }
}
