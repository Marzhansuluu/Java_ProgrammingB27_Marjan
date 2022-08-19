package day05_arithmetic_operators;

public class KgToPounds {
    public static void main(String[] args) {
        int kg=1;
        double pound=2.20462;
        double result= kg*pound;
        String result2= kg * 10 + " kg equal to "+ result * 10 + " pounds.";
        System.out.println(result2);
       String result3= kg * 20 + " kg equal to "+ result * 20 + " pounds.";
       System.out.println(result3);

        /*  create a class called KgTopounds, and write a program that can convert Kg to pound and print the result
            Ex:
                kg = 10;
                output:
                    10 kg equal to 22.0462 pounds
                kg = 20
                output:
                    20 kg equal to 44.0924 pounds
                ....
            Hint: 1kg = 2.20462 pounds

         */
    }
}
