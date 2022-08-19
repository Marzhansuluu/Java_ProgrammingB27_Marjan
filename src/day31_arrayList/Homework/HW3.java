package day31_arrayList.Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        /*
        Create an ArrayList of Characters
Fill the ArrayList with letters of your name. Each letter as a different element
Print each letters on a separate line by accessing each element
         */
        ArrayList<Character> name = new ArrayList<>();

        name.addAll(Arrays.asList('M', 'a', 'r', 'j', 'a', 'n'));
        System.out.println(name);

        for(Character i= 0; i < name.size(); i++){
            System.out.println(name.get(i));
        }

    }
}
