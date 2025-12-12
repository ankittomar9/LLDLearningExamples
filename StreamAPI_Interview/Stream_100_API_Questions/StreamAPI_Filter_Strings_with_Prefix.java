package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI_Filter_Strings_with_Prefix {
    public static void main(String args[]){
            //Filter_Strings_with_Prefix
     List<String> words=Arrays.asList("Aman","Anuj","Naman","NoName","Surname"
                ,"MyName","Avesh","ankit","ankush"
     );   

      List<String> PrefixFilter=words.stream()
      .filter(name->name.startsWith("A"))       // is case sensitive
      .sorted(Comparator.reverseOrder())
      .collect(Collectors.toList());

      System.out.println("Name Starting with A in Reverse \n"+PrefixFilter);


    }
    
}
