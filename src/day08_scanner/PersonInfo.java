package day08_scanner;

import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // ask for first name, last name and address
        System.out.println("Enter your first name: ");
        String firstname = scan.next();

        System.out.println(" Enter your last name: ");
        String lastName = scan.next();
        scan.nextLine();// i need to add empty nextline in order to put my third input or others.

        System.out.println("Please enter your address: ");
        String address =  scan.nextLine();

        System.out.println(firstname);
        System.out.println(lastName);// after the last name I need to put empty another nextLine otherwise I will not have a chance to put my address, because prinline eccepts the enter key ad input.
        System.out.println(address); // i put my input then i hit enter to put second input, nextline accepts enter key also, that's why before nextline i need to put empty nextline.

        //System.out.println("Name: " + firstname + " " + lastName + );
    }
}
