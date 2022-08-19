package day31_arrayList.Homework;

import java.util.ArrayList;

public class Hw2 {
    public static void main(String[] args) {
        /*
        Practice flow:
Create an ArrayList of Strings
add these elements:
    Iron Man, Spider Man, Thor, Captain America, Hawkeye

    remove Thor by index

    remove Iron Man by element

    remove the first index

Print the ArrayList after each action to see how the change is made
         */

        ArrayList<String> words = new ArrayList<>();
        words.add("Iron Man");
        words.add("Spider Man");
        words.add("Thor");
        words.add("Captain America");
        words.add("Hawkeye");
        System.out.println(words);

        words.remove(2);
        System.out.println(words);

        words.remove("Iron Man");
        System.out.println(words);
        System.out.println(words.contains("Iron Man"));


        words.remove(1);
        System.out.println(words);


    }
}
