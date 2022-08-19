package day32_arrayList.Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLessCharacters {
    public static void main(String[] args) {
        /*
        Four or less
Given an ArrayList of Strings, go through and find Strings that are 4
characters or less. Take those Strings and put them into a different
ArrayList. Print that ArrayList of words
Ex:
Input:
“apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
Output:
 [ tree, loop, cat ]
         */

        ArrayList<String> words = new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));
        ArrayList<String> newWords = new ArrayList<>();
        for (String each : words) {
            if(each.length() <= 4){
                newWords.add(each);
            }

        }
        System.out.println(newWords);

    }
}
