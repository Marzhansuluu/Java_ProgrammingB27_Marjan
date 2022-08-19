package day08_scanner;
import java.util.Scanner;// sometimes it can be * it means we will use all the packages.
public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();

        System.out.println("After addition :" + (num1 + num2)); // input.nextInt() + input.nextInt();===> it means it will not store your input number we can not reuse the value, if we create as a variable it will store it. We use parenthesis in order to start the addition between two value.

    }
}
