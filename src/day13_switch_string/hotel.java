package day13_switch_string;

import java.util.Scanner;

public class hotel {
    /* Ask the user how many days they will stay at the hotel
        Then ask the user how many people are in their party (how many people are
                staying in the room)
        Use those two information to determine the price and room type for the
        hotel based on the below data:
        party size: 1
        room type: single room
        price: number of days * 100
        party size: 2
        room type: double room
        price: number of days * 125
        party size: 3 or 4
        room type: large room
        price: number of days * number of people * 150
        party size: 5, 6, or 7
        room type: suite
        price: number of days * 5000
        any other party size:
        Display one message:
        Sorry we don't have any available rooms for
        that size party
            */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many days you will stay at the hotel?");
        int daysInHotel = scan.nextInt();
        System.out.println("How many people are in your party?");
        int people = scan. nextInt();
        String roomType;
        int price;

        switch (people){
            case 1:
                roomType = "Single Room";
                price = daysInHotel * 100;
                break;
            case 2:
                roomType = "Double room";
                price = daysInHotel * 125;
                break;
            case 3:
            case 4:
                roomType = "Large Room";
                price = daysInHotel * people * 150;
                break;
            case 5:
            case 6:
            case 7:
                roomType = "Suite";
                price = daysInHotel * 5000;
                break;
            default:
                roomType = "Sorry we don't have any available rooms for that size party";
                price = 0;

        }
        System.out.println(roomType);
        System.out.println(price);
    }
}
