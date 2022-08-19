package day18_loops;

import java.util.Scanner;

public class doWhileEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;
        do{
            System.out.println("enter a number between 1 and 10");
            n = s.nextInt();
        }while(n < 1 || n > 10); // if user puts -6, while condition is true that's it will reask to put number because we put n = s.nextInt(); if we put 88. 88 is bigger than 10, it will run again. when we put a number between 1-10 in that time while condition gives me error. in that time our last sout will print.
        System.out.println(n + " is between 1 and 10.");
    }
}
