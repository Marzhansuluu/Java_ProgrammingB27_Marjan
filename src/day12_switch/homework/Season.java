package day12_switch.homework;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        /*
        Season Finder
declare and assign a month number. Bases on the below data determine what
season it is and what kind of clothes to wear. You can create your own
expectations of what kind of clothes to wear based on the month
12, 1, 2 --> Winter
3, 4, 5 --> Spring
6, 7, 8 --> Summer
9, 10, 11 --> Fall
Ex:
2
It is winter, so wear a winter coat, gloves and a hat
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1-12");
        int monthNumber = scan.nextInt();


        switch(monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("It is winter, so wear coat, gloves and a hat");
                break;

            case 3:
            case 5:
            case 4:
                System.out.println("It is spring, so take an umbrella");
                break;

            case 6:
            case 8:
            case 7:
                System.out.println("It is summer, so put a sunscreen");
                break;

            case 9:
            case 11:
            case 10:
                System.out.println("It is fall, do not forget to wear your rain boots");
                break;
        }
    }
}
