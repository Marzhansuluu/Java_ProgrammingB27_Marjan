package day16_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        /*
        create a program to ask the user to enter their first name and last name.
Then print the initials of the person in uppercase format.
The initials are made up of the first letters of the first and last names.
Ex:
james
bond
JB
Ex:
anna
lee
AL
         */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = s.next();
        System.out.println("Enter your last name");
        String lastName = s.next();
        String initial = "" + firstName.charAt(0) + lastName.charAt(0);// if i won't put empty quotation mark, the code will be wrong becuase it will do math equation.
        System.out.println("First name is: " + firstName);
        System.out.println("Last name is: " + lastName);
        System.out.println(initial.toUpperCase());
    }
}
