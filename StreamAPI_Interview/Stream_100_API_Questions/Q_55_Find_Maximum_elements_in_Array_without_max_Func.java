package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;

public class Q_55_Find_Maximum_elements_in_Array_without_max_Func {
    
    public static void main(String args[]){

        //Find the Maximum element in an array (without .max())
        
        int[] nums = {12, 45, 78, 33, 91, 54};
        int max=Arrays.stream(nums)
        .reduce((a, b)-> a > b ? a : b)
        .getAsInt();

        System.out.println("max element is : "+ max);
    }
}
