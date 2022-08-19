package day19_for_loops.homework;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        /*
        Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.
Ex:
	Input:
		11
    Output:
		prime
Ex:
	Input:
		10
    Output:
		not prime
         */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

       boolean primeNumber = false;

        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0 || num % 3 ==0 || num % 5== 0 || num % 7 == 0 ){
                primeNumber = false;


            }else{
                primeNumber = true;
            }

        }
        System.out.println("Is input number a Prime number?: " + primeNumber);

    }
}
