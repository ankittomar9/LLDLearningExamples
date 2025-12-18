package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_32_SkipAndLimitElements {
    // Skip and Limit the elements in a given List
    public static void main(String args[]){
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
        
        List<Integer> SkipElementsResult = numbers.stream()
                .skip(2)
                .limit(8)
                .collect(Collectors.toList());
        
    System.out.println("Skipped elements limited \n" +SkipElementsResult);

    }
    
}
