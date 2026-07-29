package StreamAPI_Interview.stream_100_api_questions_rev1;

import java.util.Optional;

public class Q_5_Find_Not_Repeated_Characters {
    public static void main(String[] args) {
       String s1="Bookkeeper";
       
       Optional<Character> firstNonRepeated=s1.chars()
       .mapToObj(ch->(char)ch)
       .filter(ch->s1.indexOf(ch)==s1.lastIndexOf(ch))
       .findFirst();
         System.out.println(" First Non repeating char \n: "+firstNonRepeated);
    }
   
}

