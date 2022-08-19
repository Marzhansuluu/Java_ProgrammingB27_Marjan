package day11_nested_if_statements;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int validPasscode = 7041; // passcode we need to give to login
        System.out.println("Welcome to the ATM. Enter your card and enter your passcode");
        int userPasscode = input.nextInt();// passcode the user input

        if(userPasscode == validPasscode){
            System.out.println("Logged in\nSelect the number\n\t1)Check the balance\n\t2)Withdraw\n\t3)Deposit");
            int selection = input.nextInt();

            if(selection ==1){
                System.out.println("Your balance is: $1_000_000");
            }else if(selection ==2){
                System.out.println("How much do you want to withdraw");
                System.out.println("Withdrawing $" + input.nextInt());
            }else if(selection == 3){
                System.out.println("Enter the amount you want to deposit");
                System.out.println("Depositing $" + input.nextInt());
            }
        }else{
            System.out.println("Invalid passcode");
        }

    }
}
