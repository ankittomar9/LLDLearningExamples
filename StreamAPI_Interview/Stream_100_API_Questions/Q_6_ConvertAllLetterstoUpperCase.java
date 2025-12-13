package StreamAPI_Interview.Stream_100_API_Questions;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_6_ConvertAllLetterstoUpperCase {
    public static void main(String args[]){
    //Convert List of Strings to Uppercase 
    
    List<String> words=Arrays.asList("Software","Developer",
    "Learner"," Engineer");

    List<String> uppercaseWords=words.stream()
    .map(String::toUpperCase)
    .collect(Collectors.toList());
    
    System.out.println("result :\n "+uppercaseWords);

}

}

