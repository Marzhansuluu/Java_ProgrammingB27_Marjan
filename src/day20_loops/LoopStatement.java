package day20_loops;

import java.util.Scanner;

public class LoopStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list = "";

        while(true){
            System.out.println("Enter am item");
            list += input.nextLine();

            System.out.println("Do you want to add another item");// this code keep runs until you say no.
            if(input.nextLine().equalsIgnoreCase("no")){
                break;
            }
        }
        System.out.println(list);
    }
}
