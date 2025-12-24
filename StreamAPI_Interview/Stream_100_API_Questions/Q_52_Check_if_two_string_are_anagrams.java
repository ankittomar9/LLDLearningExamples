package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q_52_Check_if_two_string_are_anagrams {
    public static void main(String args[]){
        //Check if two Strings are Anagrams

        String s1="listen";String s2="silent";

        boolean isAnagram=Stream.of(
            s1.split(""))
            .sorted()
            .collect(Collectors.joining()).equals(Stream.of(
            s2.split(""))
            .sorted()
            .collect(Collectors.joining()));

            System.out.println("Anagram check  : " +isAnagram);
        
    }
    
}
