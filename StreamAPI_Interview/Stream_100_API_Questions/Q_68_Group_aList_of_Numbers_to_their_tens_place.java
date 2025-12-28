package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q_68_Group_aList_of_Numbers_to_their_tens_place {
    //68. Group a List of Numbers by their Tens Place
    public static void main(String args[]){
        List<Integer> numbers=Arrays.asList(12,15,22,81,28,31,39);

        Map<Integer,List<Integer>> groupedByTens=numbers.stream()
        .collect(Collectors.groupingBy(n->(n/10)*10));   //we can pass any condition of grouping

        System.out.println("numbers grouped by ten 's place\n"+groupedByTens);
    }
}
