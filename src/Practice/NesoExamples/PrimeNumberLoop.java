package Practice.NesoExamples;

import java.util.Scanner;

public class PrimeNumberLoop {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        int sum =1;
        for(int i = 2; i <= n/2; i++)
            if(n % i ==0)
                sum += i;
        System.out.println(sum == 1 ? "prime" : "not prime");
    }
}
