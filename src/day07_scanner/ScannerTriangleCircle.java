package day07_scanner;
import java.util.Scanner;
public class ScannerTriangleCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float angle1, angle2, angle3;
        System.out.println("Enter a angle numbers");
        angle1= input.nextFloat();
        System.out.println("Enter second angle numbers");
        angle2= input.nextFloat();
        System.out.println("Enter third angle numbers");
        angle3 = input.nextFloat();

        boolean isItTriangle= angle1 + angle2 + angle3 == 180;
        boolean isItCircle = angle1 + angle2 + angle3 == 360;


        System.out.println("isItCircle = " + isItCircle);
        System.out.println("isItTriangle = " + isItTriangle);


        /*
        Create a program that will ask the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
         */
    }
}
