package StreamAPI_Interview.Stream_100_API_Questions;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_22_Find_All_String_that_are_Palindromes_in_List {
    public static void main(String args[]){
        //Filter the palindromic string in the List
        List<String> list=Arrays.asList("naman","aman",
        "level","java","nitin","hello","world");
        //palindromic original eqauls reverse
        List<String>palindromic_List = list.stream()
        
        .filter(word ->word.equals(    //here we need to  pass 
        // a method which checks Palindrome

        new StringBuilder(word).reverse().toString()))
        .collect(Collectors.toList());

        System.out.println("The palindromic List  \n"+palindromic_List );
             
    }
    
}
