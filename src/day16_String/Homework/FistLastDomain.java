package day16_String.Homework;

import java.util.Scanner;

public class FistLastDomain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter email");
        String email = scan.next();

        //WRITE YOUR CODE BELOW
        String firstName = email.substring(0, email.indexOf("_"));

        String lastName = email.substring(email.indexOf("_")+1 , email.indexOf("@"));

        String domain = email.substring(email.indexOf("@")+1 ,email.indexOf(".") );

        System.out.println("First name: " + firstName.substring(0, 1).toUpperCase()+firstName.substring(1, email.indexOf("_")));


        System.out.println("Last name: " + lastName.substring(email.indexOf("_")+1).toUpperCase() + lastName.substring(email.indexOf("_")+2 , email.indexOf("@")));



        System.out.println("Domanin: " + domain);
    }
}
