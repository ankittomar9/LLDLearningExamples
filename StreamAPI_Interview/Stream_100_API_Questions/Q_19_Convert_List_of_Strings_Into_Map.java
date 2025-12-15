package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q_19_Convert_List_of_Strings_Into_Map {
    public static void main(String args[]){
        List<String> words=Arrays.asList("Software","Java","Collection","Learning","Stream");

             System.out.println(" Original List \n"+words);

        Map<String,Integer> map=words.stream()
        .collect(Collectors.toMap(word->word , String::length));

        System.out.println(" Map : \n"+map);


    }
}
