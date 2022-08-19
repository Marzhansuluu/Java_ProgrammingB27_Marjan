package day27_methods.homework;

import java.util.Scanner;

public class EligibleToVote {
    /*
    create a method that will accept an age and determine if the person is eligible to vote. Person must be 18 years or older to vote
     */
        public static void eligibleToVote(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your age");
            int num = scan.nextInt();
            if(num >= 18){
                System.out.println("You are eligible to vote");
            }else{
                System.out.println("You are not eligible");
            }

        }

    public static void main(String[] args) {

        eligibleToVote();
    }

}
