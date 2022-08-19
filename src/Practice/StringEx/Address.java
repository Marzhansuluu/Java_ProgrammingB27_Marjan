package Practice.StringEx;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        /*
        create a class Address
        ask the user to enter their address as one input check which street the house is on and which side of the street handle any extra spaces in the beginning or end of input address at the end also print the address as all uppercase letter

        houses that have number starting with the numbers 500 are on the right side of the street while the address that start with numbers 600 are on the left side of the street.
        the street they are on is given in the address
        print the street by checking for these streets
        drive: house on drive
        lane: hose on lane
        ave: house on avenue
         */
        Scanner input =new Scanner(System.in);
        String address = input.nextLine().toUpperCase();
        address = address.trim();


        if(address.startsWith("500") ){
            System.out.println("house on the right side");
        }else{
            System.out.println("house on the left side");
        }
        if(address.contains("DRIVE")){
            System.out.println("house is on drive");
        }else if(address.contains("LANE")){
            System.out.println("house is in lane");
        }else if(address.contains("AVENUE")){
            System.out.println("house is in avenue");
        }
    }
}
