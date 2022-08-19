package day18_loops;

import java.util.Scanner;

public class EnterNumberBetweenOneTen {
    public static void main(String[] args) {
        /*
        Enter a number between 1 and 10. When user puts -5, i want to say -5 is not between 1 and 10, try again, until user puts correct number i want to give this message.When users puts correct number I want to say is between 1 and 10. Thanks.
         */
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();// before checking the while condition we need to put this code in that way the input number will get checked in the while loop.

        while(n < 1 || n > 10){// when user gives 5, 5 is less than 1 false|| 5 is not bigger than 10 false. while condition is wrong thats why the code is not execute getting executed. in this case our last sout will work.
            System.out.print(n+ " is not between 1 and 10. Try again");
            n = s.nextInt();// until the user puts correct number this code keep popping up.
        }
        System.out.println(n + "is between 1 and 10. Thanks");
    }
}
