package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_31_Join_a_String_Using_delimiter {
    public static void main(String args[]){
        List<String> list=Arrays.asList("user","local","bin");

        String joined=list.stream()
        .collect(Collectors.joining("-"));

        System.out.println("Joined String is : \n"+joined);
        //Output looks like this   user-local-bin

      

    }
    
}
