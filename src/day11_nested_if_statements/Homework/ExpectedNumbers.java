package day11_nested_if_statements.Homework;

import java.util.Scanner;

public class ExpectedNumbers {
    public static void main(String[] args) {
        /*
        declare and assign two expected numbers:
pincode: 1234
ssn: 1111
ask the user to enter the two numbers and compare them with the system
values defined above. If they match print Authentication successful
if they don't match print all the reasons that authentication failed:
if the pincode was incorrect print: Pin Code is incorrect
if the ssn was incorrect print: Last 4 SSN numbers are incorrect
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter pin code number:");
        int expectedNum1 = scan.nextInt();
        System.out.println("Enter the ssn");
        int expectedNum2 = scan.nextInt();

        int pinCode = 1234;
        int ssn = 1111;

        if(expectedNum1 == pinCode && expectedNum2 == ssn){
            System.out.println("Authentication successful!");
            System.out.println("Please select one option:\n\t1)Check the last statement\n\t2)Make a payment\n\t3)Dispute a transaction\n\t4)Freeze account");
            int selection = scan.nextInt();
            if(selection == 1){
                System.out.println("Your last statement is: $1_000");
            }else if(selection ==2){
                System.out.println("Please select the option\n\t1)Last statement\n\t2)Outstanding balance\n\t3)Others");
                int selection2 = scan.nextInt();
                if(selection2 == 1){
                    System.out.println("Your last statement is successfully paid");
                }else if(selection2 ==2){
                    System.out.println("Your outstanding balance successfully paid");
                }else if(selection2 == 3){
                    System.out.println("Your other amount successfully paid");
                }
            }else if(selection == 3){
                System.out.println("Your dispute successfully done");
            }else if(selection == 4){
                System.out.println("Your account successfully frozen");
            }

        }else{
            if(expectedNum1 != pinCode) {
                System.out.println("Pin Code is incorrect");
            }else if(expectedNum2 != ssn){
                System.out.println("The last 4 digit of ssn are incorrect");
            }
            System.out.println("Authentication failed");
        }
    }
}
