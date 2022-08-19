package day13_switch_string;

import java.util.Scanner;

public class VendingMachine {
    /*
    vending machine
    1
    2
    3
    drinks
    4
    5
    6
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to vending machine. Select the menu you want to see \n\tSnacks\n\tDrinks");
        String menu = input.next();
        switch(menu){
            case "Snacks":
                System.out.println("Pick the snack:\n1)Chips 2)Cookies 3)Pretzels 4)Candy");
                int snackOption = input.nextInt();
                if(snackOption == 1){
                    System.out.println("Chips are selected\n\t1)Doritos\n\t2)hot chips\n\t3)popcorn");
                    int chipsOption = input.nextInt();
                    if(chipsOption == 1){
                        System.out.println("Doritos has been selected");
                    }else if(chipsOption == 2){
                        System.out.println("hot chips has been selected");
                    }
                }else if(snackOption == 2) {
                    System.out.println("Cookies are selected");
                }else if(snackOption == 3) {
                    System.out.println("Pretzels are selected");
                }else if(snackOption == 4){
                    System.out.println("Candy is selected");
                }else{
                    System.out.println("Not a valid item");
                }
                break;

            case "Drinks":
                System.out.println("Pick the drink:\n1)Coke 2)Sprite 3)MtnDew 4)DrPepper");
                int drinkOption = input.nextInt();
                if(drinkOption == 1){
                    System.out.println("Coke is selected");
                }else if(drinkOption == 2) {
                    System.out.println("Sprite is selected");
                }else if(drinkOption == 3) {
                    System.out.println("Mtn Dew is selected");
                }else if(drinkOption == 4){
                    System.out.println("DrPepper is selected");
                }else{
                    System.out.println("Not a valid item");
                }
                break;
        }


    }
}
