package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_25_Remove_duplicates_in_a_List {
    public static void main(String args[]){
        List<Integer> list= Arrays.asList(1,2,3,4,1,2,3,4,4,6,2,1,5);
          System.out.println("Original  list\n " +list);

        List<Integer>removed_Duplicates=list.stream()
        .distinct()
        .collect(Collectors.toList());


        System.out.println("removed Duplicates list \n" +removed_Duplicates);

    }
    
}
