package day16_String;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        /*
        ask the user to enter their first name
        ask the user to enter last name
        print both names in proper format
        uppercase fir letter _ everything in lowercase
         */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firsName = s.nextLine().toLowerCase();
        System.out.println("Enter last name: ");
        String lastName = s.nextLine().toLowerCase();
       firsName = firsName.substring(0,1).toUpperCase() + firsName.substring(1); // we gave 0,1 range because we want in this range if we will give 0 then it will take entire string and plus first character upper case
       lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        System.out.println("First name: " + firsName);
        System.out.println("Last name: " + lastName);


    }
}
