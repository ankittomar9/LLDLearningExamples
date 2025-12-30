package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Q_79_Generate_Random_Numbers_Using_Stream {
    public static void main(String args[]){
        // Generate a list of random numbers using Stream.
        List<Integer> randomNumbers
        =new Random().ints(5,1,100)
        .boxed()
        .collect(Collectors.toList());

        System.out.println("Random Numbers from 1 to 100 are : \n"+randomNumbers);
    }
    
}
