package StreamAPI_Interview.Stream_100_API_Questions;
import java.util.Arrays;
import java.util.List;
public class Q_3_StreamAPI_find_Maximum {
    public static void main(String args[]){
        // Find Maximum and Minimum in the List
        List<Integer>list=Arrays.asList(10,45,5,6,80,4,30);

        int maxNumber=list.stream()
        .max(Integer::compare)
        .orElseThrow();

        System.out.println(" Max number in a given List : " +maxNumber);

        int minNumber=list.stream()
        .min(Integer::compare)
        .orElseThrow();

        System.out.println(" Min number in a given List : " +minNumber);
    }
    
}

