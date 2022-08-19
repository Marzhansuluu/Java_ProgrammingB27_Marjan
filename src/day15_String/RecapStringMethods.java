package day15_String;

public class RecapStringMethods {
    public static void main(String[] args) {


        String first = "   Testing  ";

        first.toUpperCase();
        System.out.println(first);//we just declare the upper case. we still get the original value

        String second = first.toUpperCase();
        System.out.println(second); //"we declare second string and give the same value of the first one with upper case.
        System.out.println(first);// we still get the original value

        System.out.println(first.toUpperCase());// in here we will get the value in upper case but we still did not lose the original value.

        first = first.toUpperCase();
        System.out.println(first);// in here I lost the original value by replacing the value.



        first.toLowerCase();
        System.out.println(first);// I just declare the lower case method, when i print I will get Upper case text.

        first.trim();
        System.out.println(first);// in here i just declare the method.

        System.out.println(first.trim());// it will just print trimmed value once

        first = first.trim();// in here the trim method will erase the unused spaces forever
        System.out.println(first);// trim will erase the unused spaces at the beginning and end of the word/sentence

        first.length();// i just declare the length method
        System.out.println(first);// in here when i print i will get upper case "Testing"
        System.out.println(first.length());// in here I will get length of Testing. It will count how many characters Testing has.





    }
}

