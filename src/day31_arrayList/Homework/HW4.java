package day31_arrayList.Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class HW4 {
    /*
    Create an ArrayList of Characters
    Fill the ArrayList with letters from a-z
    Print the ArrayList of all the characters

    Manually remove each vowels and print the new ArrayList

     */
    public static void main(String[] args) {


        ArrayList<Character> letters = new ArrayList<>();

        for (Character i = 'a'; i <= 'z' ; i++) {
            letters.add(i);
        }

        System.out.println(letters);
        letters.removeAll(Arrays.asList('a', 'e', 'o', 'i', 'u'));

        System.out.println(letters);
    }
}
