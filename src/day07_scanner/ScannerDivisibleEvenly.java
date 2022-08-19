package day07_scanner;
import java.util.Scanner;
public class ScannerDivisibleEvenly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        boolean isItEvenlyDivisibleBy2 = num1 % 2 < 1;
        boolean  isItEvenlyDivisibleBy3 = num1 % 3 < 1;
        boolean isItEvenlyDivisibleBy5 = num1 % 5 <1;

        System.out.println("isItEvenlyDivisibleBy2 = " + isItEvenlyDivisibleBy2);
        System.out.println("isItEvenlyDivisibleBy3 = " + isItEvenlyDivisibleBy3);
        System.out.println("isItEvenlyDivisibleBy5 = " + isItEvenlyDivisibleBy5);
        /*
        Create a program that will ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values

    Ex:
    Enter a number
    65

    65 is divisible by 2: false
    65 is divisible by 3: false
    65 is divisible by 5: true
         */

    }
}
