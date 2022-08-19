package day19_for_loops;

import java.util.Scanner;

public class for_loop_factorial {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();// it is not reusable way. it is same thing with Scanner scan = new Scanner(System.in); int num= scan.nextInt(); this second code is reusable.

        int factorial = 1;
        String msg = num + "! = ";// this to print the ex 4! =

        for(int i = num; i > 1; i--){
            factorial *= i;
            msg += i + " * "; // this to continue the string ex 4! = 4 * 3 * 2 * 1 *
        }
        msg += " 1 = " + factorial; // this to print ex 4! = 4 * 3 * 2 * 1 * 1 = the 1 is string type character it will not change value we just want to manipulate the string print.

        System.out.println(factorial);
        System.out.println(msg);





    }
}
