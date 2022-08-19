package day28_methods.homework;

import java.util.Scanner;

public class Palindrome {
    /*
    create a method that will that will accept a String and find if it is
Palindrome or not (boolean)
     */


    public static boolean isPalindrome (String str){
        String reverse = "";
        boolean result = false;
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse = reverse + str.charAt(i);

        }
        if (str.equals(reverse)){
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "hello";

        str = str.toLowerCase();
        boolean a = isPalindrome(str);

        System.out.println(a);
    }
//    public static void main(String[] args) {
//        String s = "racecar";
//        System.out.println(isPalindromeWord(s));
//        String s2 ="Anna";
//        System.out.println(isPalindromeWord(s));
//        String s3 ="hello";
//        System.out.println(isPalindromeWord(s));
//
//
//    }
//    public static boolean isPalindromeWord(String s){
//        String reverse ="";
//          boolean result =false;
//        for(int i = s.length()-1; i >= 0; i--){// racecar
//            reverse = reverse + s.charAt(i);// i=6==r, i=5==a
//
//        }
//        if(reverse.equalsIgnoreCase(s)){
//            result = true;
//        }else{
//            return  false;
//        }
//
//        }



}
