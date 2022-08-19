package replitPackage;

import java.util.Scanner;

public class NegativePositiveZero {
        public static void main(String[] args) {
            //DO NOT TOUCH BELOW
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = s.nextInt();

            //WRITE YOUR CODE BELOW
            if(num > 0){
                System.out.println("positive");
            }else if(num < 0){
                System.out.println("negative");
            }else{
                System.out.println("zero");
            }
    }
}
