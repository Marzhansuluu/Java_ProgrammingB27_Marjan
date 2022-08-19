package day16_String.Homework;

import java.util.Scanner;

public class EmailHomework {
    public static void main(String[] args) {
        /*
        [Creating an email]

Ask user to enter two strings. Both strings should be at least 6 character long. If they are shorter than that print “Invalid data” and program should end.

If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cydeo.com” and print the final string as your created email.
The final email should be in all lowercase.

    input:
        JamesBond
        Secret
    output:
        jameret@cydeo.com
         String email = "saim@cydeo.com";
        int indexOfAt = email.indexOf('@');
        String name = email.substring(0, indexOfAt);

        int indexOfDot = email.indexOf('.');
        String domain = email.substring(indexOfAt + 1 , indexOfDot);// it will print until the dot.


        System.out.println("Email: " + email);
        System.out.println("Name: " + name);
        System.out.println("Domain: " + domain);
         */
        Scanner s = new Scanner(System.in);
        String firstName = "JamesBond";
        String lastName = "Secret";

        if(firstName.length() >= 6 && lastName.length() >= 6){

        }

    }
}
