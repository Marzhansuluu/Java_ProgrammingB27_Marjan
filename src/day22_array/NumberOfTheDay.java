package day22_array;

import java.util.Scanner;

public class NumberOfTheDay {
    /*
    Create a program that will ask the user to enter a number for the day of the week. Print the day of the week based on:

    1 - Monday
    2 - Tuesday
    ...
    7 - Sunday

Use array, not if statement or switch
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1-7");

        int num =scan.nextInt();
        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if(num >= 1 && num <= 7){
            System.out.println(days[num-1]);
        }else{
            System.out.println("Invalid number, please put number between 1-7");
        }

    }
}
