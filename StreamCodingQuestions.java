import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCodingQuestions {
    public static void main(String args[]){

   //1. How do you find maximum number in a list using streams;
    List <Integer> list=Arrays.asList(10,4,35,3,25,72,9,60,20);
   
    int maximumNumber=list.stream()
                .max(Integer::compare).orElseThrow();
                System.out.println("Max Number is "+maximumNumber);

    //2.Sum of all the elements using Stream
    List<Integer> list1=Arrays.asList(10,20,5,30,15);

         double sum=list1.stream()
         .mapToDouble(Integer::doubleValue).sum();
          System.out.println("Sum of numbers : "+sum);

         //3.Filter Even Numbers using Stream
        List<Integer> list2=Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> EvenNumber=list2.stream()
        .filter(n->n%2==0)
        .collect(Collectors.toList());

         System.out.println("Even numbers : "+EvenNumber);

    }
    
}
