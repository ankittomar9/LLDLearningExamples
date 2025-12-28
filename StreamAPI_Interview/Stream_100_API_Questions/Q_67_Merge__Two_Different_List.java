package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q_67_Merge__Two_Different_List {
    //67. Merge Two Separate Lists into a Single Map (Zipping)
    public static void main(String args[]){
        List<String> names=Arrays.asList("Ankit","Neha","Aman");

        List<Integer> id=Arrays.asList(101,201,303);

        Map<String,Integer> result=IntStream.range(0,names.size())
        .boxed()
        .collect(Collectors.toMap(names::get,id::get));

        System.out.println("Combined  List is : \n"+result);
    }
    
}
