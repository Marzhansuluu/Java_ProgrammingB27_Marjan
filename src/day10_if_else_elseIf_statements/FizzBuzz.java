package day10_if_else_elseIf_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        //[IQ] it means interview questions.
        /*
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n1 = scan.nextInt();
       // int n1 = 15; //this is hardcoded version
        boolean isDivisibleBy3 = n1 % 3 == 0;
        boolean isDivisibleBy5 = n1 % 5 == 0;
        boolean isDivisibleByBoth = n1 % 3 == 0 && n1 % 5 == 0;

        if(isDivisibleByBoth){
            System.out.println("FrizzBuzz");
        } else if (isDivisibleBy3) {
            System.out.println("Frizz");
        }else{
            System.out.println("Buzz");
        }

        /* if (n1 % 3 == 0 && n1 % 5 == 0) { // this is for hardcoded version
            System.out.println("FizzBuzz");
        } else if (n1 % 3 == 0) {
            System.out.println("Fizz");
        } else if (n1 % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n1);
        }
         */
    }
}
