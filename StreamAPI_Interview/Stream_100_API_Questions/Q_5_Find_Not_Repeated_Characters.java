package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Optional;

public class Q_5_Find_Not_Repeated_Characters {
    public static void main(String args[]){
        //Find_FirstNot_Repeated_Characters in a string
        String s1= "Bookkeeper";

        Optional<Character> firstNotRepeated=s1.chars()
        .mapToObj(ch->(char)ch )
        .filter(ch-> s1.indexOf(ch)==s1.lastIndexOf(ch))
        .findFirst();

        System.out.println(" Last Non repeating char \n: "+firstNotRepeated);

    }
    
}

