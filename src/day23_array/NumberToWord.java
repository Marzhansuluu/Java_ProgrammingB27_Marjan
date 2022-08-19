package day23_array;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        /*
        Create a program that will ask the user to enter a number and print the number as a word. Set a range from 0 - 15 and any number not in the range should get an invalid number message

    Ex:
> 1
        one

> 10
        ten
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number 0-15");
        int num = scan.nextInt();

        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen"};

        if(num >= 0 && num <=15){
            System.out.println(word[num]);
        }else{
            System.out.println("Please enter the number between 0-15");
        }
    }
}
