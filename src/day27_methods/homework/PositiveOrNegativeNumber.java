package day27_methods.homework;

import java.util.Scanner;

public class PositiveOrNegativeNumber {
    /*
    create a method that will accept a number. Find and print if it is a positive number, negative number, or zero
     */
    public static void PositiveOrNegativeZero(int num){
        if(num > 0){
            System.out.println("The number is positive");
        }else if(num ==0){
            System.out.println("The number is zero");
        }else{
            System.out.println("The number is negative");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num2= scan.nextInt();
        PositiveOrNegativeZero(num2);
    }
}
