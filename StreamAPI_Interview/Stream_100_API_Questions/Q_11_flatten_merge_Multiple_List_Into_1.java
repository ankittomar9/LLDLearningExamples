package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Q_11_flatten_merge_Multiple_List_Into_1 {
     public static void main(String args[]){
        //Flatten or Merge a  List of Lists

    List<List<Integer>> list=Arrays.asList(
        Arrays.asList(1,2,3),            //list1
          Arrays.asList(7,8,9,10),       //list2
          Arrays.asList(4,5,6)           //list 3
          
    );    
     System.out.println("Original List \n"+list+"\n");

    List<Integer> merged_Faltten = list.stream()
    .flatMap(List::stream)
    .collect(Collectors.toList());

    System.out.println("Merged Flatten List \n"+merged_Faltten); // Merged into single List


    }
    
}

