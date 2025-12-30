package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_80_Find_Pair_of_Numbers_with_a_Given_Sum {
    public static void main(String args[]){
        List<Integer> numbers=Arrays.asList(1,2,3,4,5);
        int targetSum=6;

        List<List<Integer>> pairs=numbers.stream()
        .flatMap(a->numbers.stream()
        .filter(b->a+b == targetSum && a  < b )
        .map(b->Arrays.asList(a,b)))
        .collect(Collectors.toList());

        System.out.println("pairs are  : \n"+pairs);



    }
    
}
