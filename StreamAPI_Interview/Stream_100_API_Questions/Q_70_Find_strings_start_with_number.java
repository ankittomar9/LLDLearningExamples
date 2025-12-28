package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_70_Find_strings_start_with_number {
    //70. Identify Strings that start with a Number
    public static void main(String args[]){
        List<String> data=Arrays.asList("1Apple", "Banana", "2Orange", "Mango");

        List<String> startWithDigit=data.stream()
        .filter(s->Character.isDigit(s.charAt(0)))
        .collect(Collectors.toList());

        System.out.println("List is  \n "+startWithDigit);
    }
}
