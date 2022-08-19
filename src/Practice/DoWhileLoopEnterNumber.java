package Practice;

import java.util.Scanner;

public class DoWhileLoopEnterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10.");
        int num ;

        do{
            System.out.println("Enter a number between 1 and 10.");
            num = scan.nextInt();

        }while(num < 1 || num >= 10);
        System.out.println(num + " is between 1 and 10");
    }
}
