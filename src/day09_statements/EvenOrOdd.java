package day09_statements;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        if(num % 2 ==0){
            System.out.println(num + " is even");
        }
        if(num % 2 ==1){ // !=0
            System.out.println(num + " is odd");
        }
    }
}
