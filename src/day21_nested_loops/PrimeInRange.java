package day21_nested_loops;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        /*
        prime: number is only divisible by 1 and itself
        print all the prime number up to a certain number
        50
        print all the prime number 2-50;
        2,3,5,7,11.....47, 49
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter number");
        int range = scan.nextInt();
        // outer loop checks all the numbers from 2 - range.
        for( int i = 2; i <= range; i++){// starting 2 and going until the range number

            boolean isPrime = true;// every time outer loop runs the boolean variable has a value of true, it means for every number in the range, we start from true.

            // inner loop checks if the number is prime
            for(int j = 2; j < i; j++){//starting from 2because I want to check divisibility of the number  from 2 to the number itself

                if(i % j == 0){// let's say our 'i' is in here 10, 10%2, 10%3, 10%4.... we need to check every number is divisible for with another number. The number we are checking 'i' is evenly divisible by the y values from 2 to the number it means it is not prime. Burda i surekli degisiyor, i=2 ile basliyor ve devam ediyor ayni sekilde j de. biz prime numarayi bulmak icin i'yi j'ye bolmemiz lazim sonucu 0 cikarsa demek prime degil. j inner loop kisminda oldugu icin surekli 2'den basliyor ve i'yi biz j'den buyuk olarak yazdigimiz icin surekli ondan bir alt nmarada oluyor.

                    isPrime = false;
                    break; // break stops the inner loop
                }

            }
            if(isPrime){
                System.out.println(i);// we put i, because we want to print all the prime numbers.
            }
        }

    }
}
