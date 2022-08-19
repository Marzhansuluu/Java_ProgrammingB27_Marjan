package day14_string;

import java.util.Scanner;
/*
Use scanner to read a String from the console
Remove extra spaces in the beginning or end
1. Print in all lowercase
Print the number of characters
 */
public class lengthScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String s1 = s.nextLine();// next - one word nextLine - for multiple word or sentence.
        s1 = s1.toLowerCase();
        s1 = s1.trim();

        System.out.println("lower case: " + s1);

        System.out.println("Trim: " + s1.trim());
        System.out.println("Number of characters: " + s1.length());
        s1 = s1.toUpperCase();
        System.out.println("Upper case: " + s1);


    }
}
