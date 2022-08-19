package day09_statements;

import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (true) {
            System.out.println("Hello");
        }
        System.out.println("break");

        if (false) {
            System.out.println("Bye");
        }
        System.out.println("==========================================================");
        int year = scan.nextInt();
        if (year == 2020 || year == 2021) {
            System.out.println("Stay home");
            System.out.println("Wash your hands");
            System.out.println("Social distance");
        } else {
            System.out.println("Yay! we can go out");
        }
        System.out.println("======================================================");

        double price = 39.99;
        if (price >= 20) {
            System.out.println("It is free shipping");
        }


    }
}
