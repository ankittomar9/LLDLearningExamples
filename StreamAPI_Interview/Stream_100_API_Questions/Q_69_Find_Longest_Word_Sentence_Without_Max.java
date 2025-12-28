package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;

public class Q_69_Find_Longest_Word_Sentence_Without_Max {

    //69. Find the Longest Word in a Sentence (without using max())
    public static void main(String args[]){

        String sentence="Learning Stream is Hard but Interesting";

        String longest=Arrays.stream(sentence.split(" "))
        .sorted((a,b)->Integer.compare(b.length(), a.length()))
        .findFirst()
        .orElse("");

        System.out.println("Longest word is \n"+longest);

    }
}
