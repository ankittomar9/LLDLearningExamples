package StreamAPI_Interview.stream_100_api_questions_rev2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q_2_Sort_A_List {
   public static void main(String[] args) {
       List<Integer>list =Arrays.asList(4,5,7,1,3,9,55,4,1,3,6,47,10);
        System.out.println("Original list  :\n "+list);
       System.out.println("Sorted list asc : \n "+sortedListASC(list));

        System.out.println("Sorted list DESC : \n "+sortedListDESC(list));

   } 
   public static List<Integer> sortedListASC(List<Integer> list){
    if(list==null || list.size()==0){ return List.of();}

    List<Integer>sortedList=list.stream()
    .sorted(Comparator.naturalOrder())
    .collect(Collectors.toList());
    return sortedList;
   }
   public static List<Integer> sortedListDESC(List<Integer> list){
    if(list==null || list.size()==0){ return List.of();}

    List<Integer>sortedListDesc=list.stream()
    .sorted(Comparator.reverseOrder())
    .collect(Collectors.toList());
    return sortedListDesc;
   }
}
