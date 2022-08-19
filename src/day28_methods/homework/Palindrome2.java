package day28_methods.homework;

import java.util.Scanner;

public class Palindrome2 {
    /*
    create a method that will accept a String and find if it is
Palindrome or not (boolean)
     */

    public static void main(String[] args) {

        String a = reverse("java");
        System.out.println(a);

        isPalindrome("racecar");

    }

    public static String reverse(String str){

         String result="";
        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        String reversed = result;
        return reversed;
    }
    public static boolean isPalindrome(String str){
        String reversed = reverse(str);
        return reversed.equalsIgnoreCase(str);
    }


}
