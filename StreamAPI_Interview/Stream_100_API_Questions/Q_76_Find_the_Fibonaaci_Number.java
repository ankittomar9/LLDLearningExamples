package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q_76_Find_the_Fibonaaci_Number {
    public static void main(String args[]){
        int limit=10;

        List<Integer> fibonacci=Stream.iterate(
            new int[]{0,1},f->new int[]{f[1],f[0]+f[1]} )
            .limit(limit)
            .map(f->f[0])
            .collect(Collectors.toList());

            System.out.println("Fibonacci Series is \n"+fibonacci);

    }
    
}
