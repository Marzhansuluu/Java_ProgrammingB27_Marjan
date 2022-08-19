package day32_arrayList.Homework;

import Practice.Methods.Chara;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {
        /*
        Separate Parts
        Write a program that can extract the special characters, digits and
        letters from a string and stores them into separate ArrayLists of
        Characters
        Ex:
        str = "ABCD123$%#@&456EFG!"
        list1: {$, %, #, @, &, !}
        list2: {A, B, C, D, E, F, G}
        list3: {1, 2, 3, 4, 5, 6}
         */
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> numbers = new ArrayList<>();
        ArrayList<Character> specials = new ArrayList<>();

        for(int i =0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                letters.add(str.charAt(i));
            }else if(Character.isDigit(str.charAt(i))){
                numbers.add(str.charAt(i));
            }else{
                specials.add(str.charAt(i));
            }

        }
        System.out.println("specials = " + specials);
        System.out.println("numbers = " + numbers);
        System.out.println("letters = " + letters);
    }
}
