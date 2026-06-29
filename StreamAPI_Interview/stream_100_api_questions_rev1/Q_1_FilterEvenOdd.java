package StreamAPI_Interview.stream_100_api_questions_rev1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_1_FilterEvenOdd {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Original List : \n"+list);
        List<Integer>evenList=list.stream()
        .filter(n->n%2==0)
        .collect(Collectors.toList());

        System.out.println("Even Numbers from List are : \n"+evenList);
          List<Integer>oddList=list.stream()
        .filter(n->n%2!=0)
        .collect(Collectors.toList());

        System.out.println("Odd Numbers from List are : \n"+oddList);
    }
}
