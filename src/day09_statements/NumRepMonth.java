package day09_statements;

import java.util.Scanner;

public class NumRepMonth {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.println("Enter a number between 1-12");
        int month= a.nextInt();
        System.out.println("Enter a number between 28-31");
        int num = a.nextInt();

        if(month == 1 && num == 31){
            System.out.println("It is January and your months has 31 days");
        }else if(month == 2 && num == 28){
            System.out.println("It is February and your month has 28 days");
        }else if(month == 3 && num == 31){
            System.out.println("It is March and it has 31 days");
        }else if(month == 4 && num == 30){
            System.out.println("It is April and it has 30 days");
        }else if(month == 5 && num == 31){
            System.out.println("It is May and it has 31 days");
        }else if(month == 6 && num == 30){
            System.out.println("It is June and it has 30 days");
        }else if(month == 7 && num == 31){
            System.out.println("It is July and it has 31 days");
        }else if(month == 8 && num == 31){
            System.out.println("It is August and it has 31 days");
        }else if(month == 9 && num == 30){
            System.out.println("It is September and it has 30 days");
        }else if(month == 10 && num == 31){
            System.out.println("It is October and it has 31 days");
        }else if(month == 11 && num == 30){
            System.out.println("It is November and it has 30 days");
        }else{
            System.out.println("It is December and it has 31 days");
        }
        /*
        create a int variable to represent the month number, where 1 is Janurary
and 12 is Decemeber.
use the month number input to determine how many days are in that month.
use the following data to help you determine the number of days in each
month:
Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days: 4, 6, 9, 11
Month that has 28 days: 2
ex:
12
31 days
ex:
9
30 days
         */
    }
}
