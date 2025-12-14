package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_1_StreamAPIEvenOddRevision {
    public static void main(String args[]){

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8, 9);
        List<Integer> EvenList=list.stream()
        .filter(n->n%2==0)
        .collect(Collectors.toList());
        System.out.println("EvenList : "+EvenList);


        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8, 9);
        List<Integer> OddList=list1.stream()
        .filter(n->n%2!=0)
        .collect(Collectors.toList());
        System.out.println("EvenList : "+OddList);


    }
    
}

