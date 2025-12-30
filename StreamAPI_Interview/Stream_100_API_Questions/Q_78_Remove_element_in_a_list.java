package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_78_Remove_element_in_a_list {
    public static void main(String args[]){
        //78. Remove All Occurrences of a Specific Element from a List
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Original List \n"+ list);
        int elementToRemove=7;

        List<Integer> resultList=list.stream()
        .filter(i->i != elementToRemove)
        .collect(Collectors.toList());

 System.out.println("\nList after removed element : "+elementToRemove + "\n " );
 System.out.println(""+resultList);

    }
    
}
