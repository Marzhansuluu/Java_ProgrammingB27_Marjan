package day14_string.Homework;

import java.util.Scanner;

public class UserInputString {
    public static void main(String[] args) {
        /*
        Use scanner to read a String from the console
Remove extra spaces in the beginning or end
Print in all lowercase
Print the number of characters
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = scan.nextLine();

        password = password.trim();// trim

        System.out.println(" length: " + password.length());// length method after i trimmed
        password=password.toLowerCase();// lower case
        System.out.println("lower case: " + password);

        password = password.toUpperCase();// upper case
        System.out.println("upper case: " + password);
    }
}
