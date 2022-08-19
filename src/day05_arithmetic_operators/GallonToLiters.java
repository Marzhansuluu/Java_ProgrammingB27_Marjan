package day05_arithmetic_operators;

public class GallonToLiters {
    public static void main(String[] args) {
        int gallon=1;
        double liter=3.78541;
        String convert1= gallon + " gallon equal to " + liter + " liters.";
        String convert2= gallon * 10 + " gallons equal to " + liter * 10 + " liters.";
        System.out.println(convert2);
        String convert3= gallon * 20 + " gallons equal to " + liter * 20 + " liters.";
        System.out.println(convert3);

        /* create a class called GalonsToLiters, and write a program that can convert the gallons to litters
            Ex:
                gallon = 10;
                output:
                    10 gallons equal to 37.8541 liters
                gallon = 20
                 output:
                    20 gallons equal to 75.7082 liters

         */
    }
}
