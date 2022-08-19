package Practice.Methods;

import java.util.Scanner;

public class CustomMethodParameters {

    public static void displayValue(int num){// we declare only one parameter
        System.out.println("The value is : " + num);
    }

    public static void eligibleToVote(int age, boolean isCitizen){

        if(age >=18 && isCitizen){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible");
        }

    }

    public static void main(String[] args) {
        displayValue(5);// 5 is args,


        eligibleToVote(15, true);
    }


}
