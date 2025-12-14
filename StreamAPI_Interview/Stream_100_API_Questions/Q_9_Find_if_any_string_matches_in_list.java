package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_9_Find_if_any_string_matches_in_list {
    public static void main(String args[]){

        // Filter the List with a Given String and see If
       // String matches
        List<String> list=Arrays.asList("api","why",
        "learning api","just chill","build api");

        List<String> matchList=list.stream()
        .filter(s->s.contains("api"))
        .collect(Collectors.toList());

        System.out.println("Filtered api \n"+matchList);

        



    }
}

