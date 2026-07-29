package StreamAPI_Interview.stream_100_api_questions_rev1;

import java.util.Arrays;
import java.util.List;

public class Q_3_Find_Maximum_in_a_List {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(3,7,4,44,55,33,9,7,1,2,5,6);
            System.out.println("Original Numbers from List : \n"+list);
          System.out.println("Maximum number : \n"+findMaximum(list));
    }
    public static int findMaximum(List<Integer> list){
  if (list == null || list.isEmpty()) {
            System.out.println("Empty List");
            return 0;     
        }

        int maximum=list.stream()
        .max(Integer::compare)
        .orElseThrow();

        return maximum;
    }
}
