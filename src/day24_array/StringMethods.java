package day24_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        /*

         */

        String s = "hello world";
        char [] letters = s.toCharArray();
        System.out.println(letters);// it will print all the characters, but it will be in one line.
        System.out.println(Arrays.toString(letters));// it will print all characters in different line.
        System.out.println(s.length());// it will count the string character length
        System.out.println(letters.length); //it will count the elements

        System.out.println(letters[0]);// it will give me the first elements 'h'.

        for(char eachLetter : s.toCharArray()){ // we can also do eachletter : letters
            System.out.println(eachLetter);

        }
        System.out.println("---------------------------------------------------------");

        String str = "monday,tuesday,wednesday,thursday,friday,saturday,sunday";
        System.out.println(Arrays.toString(str.split(",")));

        for(String eachDay: str.split(",")){
            System.out.println(eachDay);
        }

        System.out.println("-----------------------------------------------");

        String str2 = "Jan-Feb-Mar-April-May-Jun-Jul-Aug-Sep-Oct-Nov-Dec";
        String[] months = (str.split("-"));

        for(String eachMonths : months){
            System.out.println(eachMonths);// all the months will print in different line
        }

        System.out.println("-------------------------------------------------");

        String str3 = "mississippi";
        System.out.println(Arrays.toString(str3.split("si")));// mis, s, ppi
        System.out.println("---------------------------------------------------");

        String str4 = "java";
        System.out.println(Arrays.toString(str4.toCharArray()));// char array char[] j,a,v,a
        System.out.println(Arrays.toString(str4.split("")));// string array String[]j,a,v,a
    }
}
