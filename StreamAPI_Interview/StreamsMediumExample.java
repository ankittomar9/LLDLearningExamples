package StreamAPI_Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMediumExample {
    public static void main(String args[]){
        //1. Filter Even Numbers from a List
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> EvenNumbers=list.stream()
        .filter(n->n%2==0)
        .collect(Collectors.toList());
        System.out.println("Even Numbers from List : "+EvenNumbers);
        

    }
    
}
