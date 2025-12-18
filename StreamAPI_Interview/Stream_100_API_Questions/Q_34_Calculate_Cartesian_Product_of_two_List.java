package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_34_Calculate_Cartesian_Product_of_two_List {
    public static void main(String args[]){
        List<Integer> list1=Arrays.asList(1,2,3);
        List<Integer> list2=Arrays.asList(1,2,3);

        List<String> cartesianProduct=list1.stream()
        .flatMap(
            i->list2.stream().map(
                j-> "("+i+","+j+")" ))
                
                .collect(Collectors.toList());       
       System.out.println("Cartesian Product is : \n"+cartesianProduct);         


    }
    
}
