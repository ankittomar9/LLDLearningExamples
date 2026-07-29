package StreamAPI_Interview.stream_100_api_questions_rev1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q_4_Filter_the_List_with_prefix {
    public static void main(String[] args) {
       List<String> words=Arrays.asList("Aman","Anuj","Naman","NoName","Surname"
                ,"MyName","Avesh","ankit","ankush", "antilla","aname"
     );   
       System.out.println("Name Starting with A in Reverse \n"+filterWithPrefix(words));
    }

    public static List<String> filterWithPrefix(List<String> list){
        if(list==null || list.isEmpty())
            {System.out.println("List is Empty or Null");  return  List.of();         
    }
        List<String> filteredWords=list.stream()
        .filter(n->n.startsWith("A"))
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());
        return filteredWords;
    } 
}
