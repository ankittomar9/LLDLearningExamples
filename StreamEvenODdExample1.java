
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamEvenODdExample1 {
    public static void main(String args[]){
       List <Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9);


        List<Integer> EvenNumbers =list.stream()
                    .filter( n-> n%2==0)
                    .collect(Collectors.toList());

          List<Integer> OddNumbers =list.stream()
                    .filter( n-> n%2!=0)
                    .collect(Collectors.toList());
                

        System.out.println("EvenNumbers : "+EvenNumbers);
         System.out.println("OddNumbers : "+OddNumbers);
    }    
}
