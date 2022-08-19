package replitPackage;

import java.util.Scanner;

public class FindMiddleNumber {
    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);

            System.out.println("Enter first number: ");
            int num1 = scan.nextInt();
            System.out.println("Enter second number: ");
            int num2 = scan.nextInt();
            System.out.println("Enter third number : ");
            int num3 = scan.nextInt();
            String middleNumber = "";

            if(num2 > num1 && num2 > num3 || num2 > num1 && num2 < num3){
                middleNumber = "This number is: " + num2;
                //}else if(num2 > num1 || num2 > num3){
                // middleNumber = " This number is: " + num2;
            }else if(num1 > num2 && num1 > num3 || num1 > num2 && num1 < num3){
                middleNumber = "This number is: " + num1;
            }else{
                middleNumber = "middle number is: " + num3;
            }
            System.out.println(middleNumber);
    }
}
