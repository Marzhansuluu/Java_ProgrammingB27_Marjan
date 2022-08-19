package day09_statements;

import java.util.Scanner;

public class SalesAmount {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
       // int sales = scan.nextInt()
        int sales = 15_000;
        if(sales < 10_000){
            System.out.println("Sorry you won't get any bonus");
        }else if(sales >= 10_000 && sales < 15_000){
            System.out.println("Yay! You will get $5000");
        }else{
            System.out.println("Yay you will get $7000");
        }
        /*
        create a sales amount variable
use the sales amount to determine the bonus you get at end of the month
if your sales amount is less than 10000 you don't get any bonus
if your sales amount is more than or equal to 10000 and less than
15000 you get a bonus of 5000
if your sales amount is more than or equal to 15000 you get a bonus
of 7000
         */
    }
}
