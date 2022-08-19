package Practice.NesoExamples;

import java.util.Scanner;

public class LoopExThree {
    public static void main(String[] args) {
        /*
        Write a program which displays the sum of the strict divisors of an integer given by the user
        Ex; 6--> 1+2+3;
        10--> 1+2+5
        hints; The strict divisors of a number N are <= N/2
        if N % i =0; then i is a divisor of N
         */
        Scanner scan = new Scanner(System.in);
        int sum =0;

        System.out.println("Enter a number");
        int n = scan.nextInt();

        for(int i =1; i < n/2; i++){
            if(n % i == 0){
                //sum += i;
                System.out.println(i + " ");
            }
            //System.out.println(sum);
        }
    }
}
