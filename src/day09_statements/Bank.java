package day09_statements;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        double balance = 1_000_000;
        double amountToWithdraw = 600_000;

        balance -= amountToWithdraw; // balance = balance - amountToWithdraw
        System.out.println(" Withdrew: " + amountToWithdraw);

        if(balance >=0){
            System.out.println("Account balance is: " + balance);
        }

        if(balance < 0){
            System.out.println("Overdraft penalty");
            System.out.println("Penalty amount due: " + amountToWithdraw * 0.15);
        }else{
            System.out.println("You still have money on your balance");
        }

        //Scanner scan = new Scanner(System.in);
    }

}
