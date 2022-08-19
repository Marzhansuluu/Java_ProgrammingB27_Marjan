package day08_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter three number: ");
        double angleOne = input.nextDouble(); // we asked only once to put input three times.The console will wait until I enter three numbers.
        double angleTwo = input.nextDouble();
        double angleThree = input.nextDouble();

        double sum = angleOne + angleTwo + angleThree; // I add all the variable in that way it will be easy for creating a boolean.

        boolean isTriangle = sum == 180;// we use == because in order to make triangle all degrees has to be equal 180;
        boolean isCircle = sum == 360;

        System.out.println("isCircle = " + isCircle);
        System.out.println("isTriangle = " + isTriangle);
    }
}
