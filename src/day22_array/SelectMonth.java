package day22_array;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("Enter the month number");
        int num = input.nextInt();

        if(num >= 1 && num <= 12){// valid months from 1-12
            System.out.println(months[num-1]);// we put -1 to convert the input number to a month index number(0) we can subtract by 1 which means if the number was 1--->1-1=0 which means index number is 0 value will be returned January.
        }else{
            System.out.println("Invalid month number. Should be 1-12.");

        }
    }
}
