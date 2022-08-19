package Practice;

import java.util.Scanner;

public class ContinueForLoop {
    public static void main(String[] args) {
        for(int i =1; i <=10; i++){
            if(i % 2 ==0)
                continue;// this one basically if our if statement is true, it will not print, it will just continue
            System.out.println(i + " ");// we are printing the odd numbers
        }
        Scanner s = new Scanner(System.in);
        int n;
        while(true){
            System.out.println("enter a number 1 and 10:");
            n = s.nextInt();
            if(n <1 || n > 10)
                continue;

            break;

        }
        System.out.println(n + " is between 1 and 10.");
    }
}
