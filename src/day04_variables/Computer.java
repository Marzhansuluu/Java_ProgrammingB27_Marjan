package day04_variables;

import java.sql.SQLOutput;

public class Computer {
    public static void main(String[] args) {
        String brand="Apple";
        String processor="Ios12";
        int ramMemory=25;
        int storageMemory=1000;
        boolean hasMonitor=true;
        boolean hasWifiCard=true;
        double price=9_999.99;
        byte numberOfUsbSlots=4;
        boolean hasBluetooth=true;

        System.out.println("The computer brand name is "+brand + " with "+ processor + ".\nRam memory " + ramMemory + " and storage Memory "+ storageMemory + " it has monitor " + hasMonitor + " has Wifi Card " + hasWifiCard + ".\n The price is " + price + " with "+ numberOfUsbSlots + " USB Slots " + " and it has Bluetooth " + hasBluetooth +".");



    }
}
/*create a class Computer
create a main method

    declare and assign these variables with the most appropriate datatypes:

        brand, processor, ram memory, storage memory, has monitor, has wifi card, price, number of USB slots, has Bluetooth

        create a summary of the information and print it. Be creative

 */
