package Practice.Loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /*
        write a program that calculates the factorial of a number:
        ex: 5! = 5*4*3*2*1=120;
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scan.nextInt();
        int factorial = 1;
        String result ="";


        for(int i = num; i >= 1; i--){
            factorial *=i;
            result += i + " * ";
        }
        result += " 1 = " + factorial;// we add one, it will not change the result. as a message I need to add after the multiplication sign.
        System.out.println(factorial);
    }
}
