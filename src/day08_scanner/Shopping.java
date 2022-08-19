package day08_scanner;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the item name: ");
        String item = scan.nextLine();
        //String item = "Ball";

        System.out.println("What is the item price?: ");
        double price = scan.nextDouble();
        //double price = 5.99;

        System.out.println("How many " + item + "/s do you want?");
        int quantity = scan.nextInt();
        //int quantity = 3;
        
        String order = "Your total for " + quantity + " " + item + " is $" + quantity *price;

        System.out.println("order = " + order);
    }
}
