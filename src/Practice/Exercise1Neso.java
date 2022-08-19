package Practice;

import java.util.Scanner;

public class Exercise1Neso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int num =scan.nextInt();



        while(num < 1 || num > 10){
            System.out.println(num + " is not between 1 and 10. Try again");
                num = scan.nextInt();

            }
        System.out.println(num + " is between 1 and 10. Thanks");

    }
}
