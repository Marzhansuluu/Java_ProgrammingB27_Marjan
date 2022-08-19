package day20_loops;

public class PrimeNumber {
    public static void main(String[] args) {
        /*
        [IQ] Prime number

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

        int n = 19;
        boolean isPrime = true;

        if(n < 2){
            System.out.println("not prime");
            // System.exit(0); this code wwill stop our program at this point.
        }
        for(int i = 2; i < n ; i++  ){// if I find i < n/2 half number of n, it will shorten our code.
            if(n % i == 0){ // 11 % 2, 11% 3, 11 % 4, as soon as one of them not evenly divisible by these numbers it is automatically false.
                isPrime =false;
            }
        }
        System.out.println(isPrime ? "Prime" : "not prime");
    }
}
