package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q_24_FilterAndCovert_a_Map_to_List {
        public static void main(String args[]){

        Map<String ,Integer> map=Map.of("Z",26,"A", 55, "B", 5, "C", 20, "D", 10);    

        List<String> MyKeys=map.entrySet().stream()
            .filter(entry ->entry.getValue()>10)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

            System.out.println(MyKeys); // 




        }

}
