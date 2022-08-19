package day19_for_loops;

import java.util.Scanner;

public class do_while_Loops_secret_number {
    /*
    write a program that will allow you to guess a secret number.
    Define a number in the code in a specific range, for example 1-100. Then the program is for the user to guess that number
    They will guess a number and get a response. They can keep guessing until they get is right
        give hints:
            number is bigger
            number is smaller

    bonus: keep track of the number of attempts it took to guess the number
     */
    public static void main(String[] args) {

        int secretNumber  = 87;
        int inputNumber;
        int attempts =0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Guess a number");
            inputNumber = input.nextInt();

            if(inputNumber < secretNumber) {// if my input number is less than secret number i should guess a higher number
                System.out.println("Secret number is higher");

            }else if(inputNumber > secretNumber){// if my input number is higher than secret number i should guess a lower number.
                System.out.println("Secret number is lower");
            }

            attempts ++;// if i want to put in how many attempts we found the secret number.
        }while(secretNumber != inputNumber);//
        System.out.println("You guessed the number in " + attempts + "attempts.");
    }

}
