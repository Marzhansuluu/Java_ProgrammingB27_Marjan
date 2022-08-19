package day20_loops.homework;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        /*
        Count Words
    Given a sentence determine how many words are in the String.
        Ex:
            Input:
                This has multiple words
            Output:
                4
         */

        String msg = "Today is Saturday";
         //           0123456789
        int word =1;

        for(int i = 0; i < msg.length() ;++i){
            char untilSpace = msg.charAt(i);
            if(untilSpace == ' '){

                ++word;
            }
        }

        System.out.println(word);
    }
}
