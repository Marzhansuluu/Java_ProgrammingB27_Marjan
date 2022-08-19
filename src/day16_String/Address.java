package day16_String;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your address");
        String address = s.nextLine();
        address = address.toUpperCase();
        address = address.trim();
        if(address.startsWith("500")){
            System.out.println("House is on the right side");
        }else if(address.startsWith("600")){
            System.out.println("House is on the left side");
        }

        if(address.contains("DRIVE")){
            System.out.println("We are on Drive");
        }else if(address.contains("LANE")){
            System.out.println("We are on Lane");
        }else if(address.contains("AVE")){
            System.out.println("House on Avenue");
        }
    }
}
