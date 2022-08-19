package day16_String.Homework;

import java.util.Scanner;

public class relativeCheckers {
    public static void main(String[] args) {
        /*

Given two full names check if the two people are related. They will be considered to be related if they have the same last name

    Input:
        James Bond
        Jamie Bond
    Output:
        Related

    -------------------

    Input:
        James Bond
        Alex Benji
    Output:
        Not Related
         */
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the last name: ");
        String Name1 = s.nextLine();
        System.out.println("Enter the second last name: ");
        String Name2 = s.nextLine();



        if(Name1.equalsIgnoreCase(Name2)){
            System.out.println("They are related");
        }else{
            System.out.println("Not related");
        }
    }
}
