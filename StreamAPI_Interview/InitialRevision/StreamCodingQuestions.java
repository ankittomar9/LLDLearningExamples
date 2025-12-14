package StreamAPI_Interview.InitialRevision;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
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
    
     //4. Sort the List of Integers
     List<Integer> list3=Arrays.asList(10,20,5,30,15);
      List<Integer> sortedList=list3.stream()
       .sorted().collect(Collectors.toList());
         System.out.println("Sorted numbers : "+sortedList);
    
    //5.Find the Distinct in List oF Integers
    List<Integer> list4=Arrays.asList(10,15,30,20,10,6,30,10,15,6);
    List<Integer> distinctList=list4.stream()
    .distinct().collect(Collectors.toList());
       System.out.println("Distinct numbers : "+distinctList);
    
    //6  How Do you Convert a List of Strings to UpperCase using streams //explain
        List<String> stringList=Arrays.asList("Hello","World","Java");
        List<String> uppercaseString=stringList.stream()
        .map(String :: toUpperCase )
        .collect(Collectors.toList());
          System.out.println("Answer : "+uppercaseString);

     //7.How do you limit the numbers in a stream
    List<Integer> list7 =Arrays.asList(10,20,5,30,15,10,20,5,30,15);
    List<Integer>limtedList=list7.stream()
                                    .limit(3)
                                    .collect(Collectors.toList());
         System.out.println("Limited List : " + limtedList);

    //8. Skip Elements in a Stream
        List<Integer> list8=Arrays.asList(10,20,5,1,2,3,4,5,6);
        List<Integer> SkippedList=list8.stream()
        .skip(3)
        .collect(Collectors.toList());
        System.out.println("Skipped List : " + SkippedList);
    
    //9 How check if all elements are even in a List
    List<Integer> list9=Arrays.asList(2,4,6,8,10,12,14,16,1);
    boolean EvenCheck=list9.stream()
                          .allMatch(n->n%2==0);
          //  .collect(Collectors.toList());
           System.out.println("Even Check : " + EvenCheck);

    //10  Check if all elements are greater than x;
            int x=25;
        List<Integer> list10=Arrays.asList(10,20,50,30,15,101,20,5,30,105);
        List<Integer> GreaterCheckList=list10.stream()
        .filter(n->n>x)
        .collect(Collectors.toList());
              System.out.println("GreaterCheckList than x : " + GreaterCheckList);

    //11.Check if any Element is negative in a List
        List<Integer> list11=Arrays.asList(1,4,5,1,6,7,8,9,5,4,6,3);
        boolean negativeCheck=list11.stream()
        .noneMatch(n->n<0);
         System.out.println("negativeCheck : " +negativeCheck ); 
       

      //12  Count the number of Elements in a Stream
      List<Integer> list12=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
      long count=list12.stream()
                 .count();  
        System.out.println("Elements in List : " +count ); 


    //13. Concatenate two Java Streams
        Stream<Integer> s1=Stream.of(1,2,3,4,5);
        Stream<Integer>s2=Stream.of(6,7,8,9,10);
        List<Integer> concatenated=Stream.concat(s1, s2)
        .collect(Collectors.toList());
         System.out.println("concatenated List : " +concatenated ); 


    //14 Group a list of string ny their length using Streams

            List<String> strings=Arrays.asList("apple","apple",
            "kiwi","apple","apple","kiwi","banana","kiwi");

            Map<Integer,List<String>> groupMap=strings.stream()
                    .collect(Collectors.groupingBy(String::length));
                
              System.out.println("grouped by length : " +groupMap ); 




































        }

}