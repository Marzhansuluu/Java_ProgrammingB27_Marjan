package day07_scanner;
import java.util.Scanner;
public class ScannerRevenuePricyQuantity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter price: ");
        int price = scan.nextInt();

        System.out.println("Enter quantity: ");
        int quantity = scan.nextInt();

        int revenue= price * quantity;

        System.out.println("revenue = price * quantity: " + revenue);
        /*
        Create a program that will ask the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.
         */
    }

}
