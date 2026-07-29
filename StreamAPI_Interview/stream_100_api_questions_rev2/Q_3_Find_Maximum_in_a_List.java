package StreamAPI_Interview.stream_100_api_questions_rev2;

import java.util.Arrays;
import java.util.List;

public class Q_3_Find_Maximum_in_a_List {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,7,4,95,6,9,82,3,4,6,47);
        System.out.println("Original List : "+list);
        System.out.println("Maximum List in the number is : \n"+findMaximum(list));
    }
    public static int findMaximum(List<Integer> list){
        if(list== null || list.isEmpty()){return 0;}

        int maximum=list.stream()
        .max(Integer::compare)
        .orElseThrow();

        return maximum;
    }
}
