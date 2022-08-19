package day10_if_else_elseIf_statements;

import java.util.Scanner;

public class DaysInMonths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a month number between 1-12");
        int month = input.nextInt();
        int day=0;

        boolean has31Days = month ==1  || month ==3 ||  month ==5 ||  month == 7 || month == 8 || month ==10 || month == 12;// we put all month which one has 31 days.
        boolean has30Days = month ==4 || month == 6 || month ==9 || month ==11;
        boolean has28Days = month ==2;

        if(has31Days){// when we input the 1-12 month let's say 10, in here our "has31 days" statement is "true" which means october has 31 days, that's why printing 31 days. if this statement was "false" then it will jump to next statement.
            day =31;
        }else if(has30Days){
            day= 30;
        }else if(has28Days){
            day = 28;
        }
        if(day > 0){
            System.out.println("Month: " + month);
            System.out.println("Days in the month: " + day);
        }else{
            System.out.println(month + " is not a valid data");
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
