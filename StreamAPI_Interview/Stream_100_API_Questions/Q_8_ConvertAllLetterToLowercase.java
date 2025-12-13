package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_8_ConvertAllLetterToLowercase {
    public static void main(String args[]){
        List<String> str=Arrays.asList("I AM","LEARNING","EVERYDAY","TO BECOME","BETTER" ,"ENGINEER");

        List<String> lowerCasewords=str.stream()
        .map(String::toLowerCase)
        .collect(Collectors.toList());

         System.out.println("result :\n "+lowerCasewords);





        
    }
    
}
