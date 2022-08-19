package day09_statements;

import java.util.Scanner;

public class NumberRepDay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if(number == 1){
            System.out.println("It's Monday");
        }else if(number == 2){
            System.out.println("It's Tuesday");
        }else if(number == 3){
            System.out.println("It's Wednesday");
        }else if(number == 4){
            System.out.println("It's Thursday");
        }else if(number == 5){
            System.out.println("It's Friday");
        }else if(number ==6 ){
            System.out.println("It's Saturday");
        }else{
            System.out.println("It's Sunday");
        }

        /*
        create a number to represent the day. (1 being Monday and 7 being Sunday)
Print the day related to the number
Ex:
2
Tuesday
Ex:
5
Friday
         */
    }
}
