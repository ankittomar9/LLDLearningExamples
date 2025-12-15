package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Q_17_Remove_Null_values_in_given_string_of_list {
    public static void main(String args[]){
        //Remove Null values in list of given strings

        List<String> words= Arrays.asList("Java",null,"collection",
                null,"learning",null,"is",null,"fun");

        System.out.println("Original list \n"+words);

        List<String> filteredNulls=words.stream()
        .filter(Objects::nonNull)
        .collect(Collectors.toList());

         System.out.println("Removed Nulls \n"+filteredNulls);

    }
    
}
