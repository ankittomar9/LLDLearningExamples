package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.stream.IntStream;

public class Q_Two_Sum_Problem_target {
    public static void main(String args[]){
        int nums[]={2,7,11,15};
        int target=9;


        int []result= IntStream.range(0,nums.length)
        .boxed()
        .flatMap(i-> IntStream.range(i+1,nums.length)
        .filter(j->  nums[i]+nums[j]==target)
    .mapToObj(j->new int[]{i,j}))
    .findFirst()
    .orElse(new int[]{});

    System.out.println("pair is \n"+result);
        
    }
    
}
