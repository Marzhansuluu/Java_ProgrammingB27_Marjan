package day27_methods.homework;

import java.util.Scanner;

public class StringToChar {
    /*
    create a method that accepts a String and print each character of the String on a separate line
     */
    public static void StringToChar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your message");
        String str = scan.nextLine();

        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {

        StringToChar();
    }
}
