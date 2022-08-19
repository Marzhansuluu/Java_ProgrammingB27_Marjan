package Practice.NesoExamples;

import java.util.Scanner;

public class LoopExTwoSum {
    public static void main(String[] args) {
        /*
        Write a program which reads a sequence of integers from the user and stops by displaying "Done when the sum of these values exceeds 100.
         */
        Scanner scan = new Scanner(System.in);
        int sum =0;
        for(int i = 0; i <= 100; i++){ // while(sum <100)
            System.out.println("Enter a number");
            sum += scan.nextInt();
            if(sum > 100){
                break;

            }
        }
        System.out.println(sum + " Done");
    }
}
