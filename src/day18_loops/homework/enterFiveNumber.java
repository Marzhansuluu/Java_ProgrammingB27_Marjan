package day18_loops.homework;

import java.util.Scanner;

public class enterFiveNumber {
    public static void main(String[] args) {
       /*
       write a program that will ask the user to enter 5 numbers and print how many were positive and how many were negative */

        Scanner scan = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int num;
        int counter = 5;// for loop,
        System.out.println("Enter number");
        while(counter > 0){
            counter--;// each time when we enter the number it will decrease the entree until the 1 starting from 5.
            num = scan.nextInt();
            if(num >= 0){
                positive++;
            }else{
                negative++;
            }

        }
        System.out.println("positive: " + positive);
        System.out.println("negative: " + negative);
    }
}
