package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q_56_Find_Duplicate_Elements_in_a_List {
    // Find Duplicate Elements in a List
    public static void main(String args[]){
        List<Integer> list=Arrays.asList(10,20,30,40,20,40,50,20);
            Set<Integer> duplicates=list.stream()
            .collect(Collectors.groupingBy(
                Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

                System.out.println("Duplicate Elements are : \n"+duplicates);
    }
    
}
