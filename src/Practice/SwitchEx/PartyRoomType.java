package Practice.SwitchEx;

import java.util.Scanner;

public class PartyRoomType {
    public static void main(String[] args) {
        /*
        Ask the user how many days they will stay at the hotel
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
        Scanner input =new Scanner(System.in);
        System.out.println("how many days they will stay at the hotel");
        int stayIn = input.nextInt();
        System.out.println("how many people are in their party");
        int people = input.nextInt();

        int price =0;
        String roomSize = "";
        switch (people){
            case 1:
                price = stayIn * 100;
                roomSize = "single room";
                break;
            case 2:
                price = stayIn * 125;
                roomSize = "double size";
                break;
            case 3:
            case 4:
                price = stayIn * people * 150;
                roomSize = "large room";
                break;
            case 5:
            case 6:
            case 7:
                price = stayIn * 5000;
                roomSize = "suite";
                break;
            default:
                roomSize = "Sorry we don't have any available rooms for\n" +
                        "that size party";
                price=0;
                //System.out.println("Sorry we don't have any available rooms for\n" +
                  //      "that size party");
        }

    }
}
