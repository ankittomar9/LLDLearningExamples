package StreamAPI_Interview.stream_100_api_questions_rev1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q_2_Sort_A_List {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(4,9,7,6,52,8,1,3,9,7,4,0);
         System.out.println("List Before Sorting \n"+list);
        sortAList(list);
        System.out.println("List after Sorting ASC \n"+sortAList(list));

         sortAList(list);
        System.out.println("List after Sorting DESC \n"+sortAListReverse(list));
    }
    public static List<Integer> sortAList(List<Integer> list){
        if(list==null || list.size()==0){ 
            System.out.println("Empty List");}

            List<Integer>sortedList=list.stream()
           .sorted(Comparator.naturalOrder())
           .collect(Collectors.toList());
           return sortedList;
    }

     public static List<Integer> sortAListReverse(List<Integer> list){
        if(list==null || list.size()==0){ 
            System.out.println("Empty List");}

            List<Integer>sortedList=list.stream()
           .sorted(Comparator.reverseOrder())
           .collect(Collectors.toList());
           return sortedList;
    }
}
