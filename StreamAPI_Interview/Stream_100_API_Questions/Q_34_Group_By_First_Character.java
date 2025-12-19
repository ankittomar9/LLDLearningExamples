package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q_34_Group_By_First_Character {
    // Group Every String By its First characters
    public static void main(String args[]){
        List<String> fruits=Arrays.asList("apple","avocado",
        "blueberry","banana","cherry","chiku","notAFruit","afruit");

        Map<Character,List<String>> myResult=fruits.stream()
        .collect(Collectors.groupingBy(word -> word.charAt(0))); 
        
        System.out.println("Filtered List is : "+myResult);
    
    
    }
}
