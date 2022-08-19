package day15_String.homework;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        /*
        create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word
that also contains 'a'
Ex:
"java"
"mouse"
"computer"
Output: java
Challenge: Instead of just checking for "a" add another variable that can
be used to check for any character.
         */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first word");
        String first = s.nextLine();
        System.out.println("Enter the second word");
        String second = s.nextLine();
        System.out.println("Enter the third word");
        String third = s.nextLine();

        String character = "a";
        String result1="";
        String result2="";
        String result3= "";

        if(first.contains(character)){
            result1 = first;
        }
        if(second.contains(character)){
            result2 = second;
        }
        if(third.contains(character)){
            result3 = third;
        }
        if(result1.length()>result2.length() && result1.length()> result3.length()){
            System.out.println("The longest word and contains \"a\" : " + first);

        }else if(result2.length()>result1.length() && result2.length()> result3.length()){
            System.out.println("The longest word and contains \"a\" : " + second);

        }else if(result3.length()>result1.length() && result3.length()> result2.length()) {
            System.out.println("The longest word and contains \"a\" : " + third);
        }




    }
}
