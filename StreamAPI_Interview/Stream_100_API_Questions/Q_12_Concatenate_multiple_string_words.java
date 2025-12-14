package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;

public class Q_12_Concatenate_multiple_string_words {
    public static void main(String args[]){
        List<String> words=Arrays.asList("Java","Collections","is","very","powerful","Feature");
           System.out.println("Old words : \n"+words+"\n");

        String concatenated_all_words=words.stream()
        .reduce("",(s1,s2)->s1+" "+s2).trim();
        

        System.out.println("New String : \n"+concatenated_all_words);
    }
    
}

