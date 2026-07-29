package StreamAPI_Interview.stream_100_api_questions_rev2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q_4_Filter_the_List_with_Prefix {
    public static void main(String[] args) {
          List<String> words=Arrays.asList("Aman","Anuj","Naman","NoName","Surname"
                ,"MyName","Avesh","ankit","ankush", "antilla","aname"
     );   
     System.out.println("Original List \n"+words);
     System.out.println("Filtered List With Prefix is : \n"+filterListWithPrefix(words));
    }
    public static List<String> filterListWithPrefix(List<String> list){
        if(list==null || list.isEmpty()){ return List.of();}

        List<String> filterWihtPrefix=list.stream()
        .filter(n->n.startsWith("a"))
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());
        return filterWihtPrefix;

    }
}
