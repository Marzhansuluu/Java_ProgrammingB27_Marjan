package day08_scanner;
import java.util.Scanner;
public class Revenue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price: ");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity: ");
        int quantity = scan.nextInt();

        System.out.println("Revenue: $" + (price * quantity));


    }
}
