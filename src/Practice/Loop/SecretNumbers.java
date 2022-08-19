package Practice.Loop;

import java.util.Scanner;

public class SecretNumbers {
    public static void main(String[] args) {
        /*
        write a program that will allow you to guess a secret number.
        Define a number in the code in a specific range, for example 1-100. Then the program is for the user to guess that number.
        They will guess a number and get a response. They can keep guessing until they get is right give hints:
        number is bigger
        number is smaller
         */

        int secretNumber = 56;


        Scanner input =new Scanner(System.in);
        int inputNumber;
        int attempts=0;


        do{
            System.out.println("Enter your guess number");
            inputNumber = input.nextInt();

            if(inputNumber < secretNumber){
                System.out.println("The secret number is higher");
            }else if(secretNumber < inputNumber){
                System.out.println("The secret number is smaller");
            }
            attempts++;
        }while(secretNumber != inputNumber);
        System.out.println("You guessed in " + attempts + " attempts.");
    }
}
