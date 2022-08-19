package Practice.SwitchEx;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        /*
        vending machine
        snacks
        1.
        2.
        3.
        drinks
        4.
        5.
        6.
         */
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to te vending machine\nSelect the menu you want to see\n\t1)Snacks\n\t2)Drinks");
        String menu =input.next();

        switch (menu){
            case"Snacks":
                System.out.println("Pick the snack\n1)orea\n2)ritz");
                int num = input.nextInt();
            switch (num){
                case 1:
                    System.out.println("You select the oreo");
                    break;
                case 2:
                    System.out.println("You selected the ritz");
                    break;

                default:
                    System.out.println("invalid number");
                    break;

            }
            case"Drinks":
                System.out.println("Pick the drink\n1)coke\n2)sprite");
                int num2 = input.nextInt();
                if(num2 == 1){
                    System.out.println("coke is selected");
                }else if(num2 ==2){
                    System.out.println("sprite selected");
                }else{
                    System.out.println("invalid number");
                }
        }
    }
}
