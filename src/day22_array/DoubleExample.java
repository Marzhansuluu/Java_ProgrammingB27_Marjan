package day22_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DoubleExample {
    public static void main(String[] args) {
        double[] prices = new double[4];
        System.out.println(Arrays.toString(prices));
        System.out.println("------------------------------");

        prices[0]=12.99;
        System.out.println(Arrays.toString(prices));
        System.out.println("------------------------------------------");

        prices[1]= 9.50;
        prices[2]= 13.10;
        prices[3] = 20.30;
        System.out.println(Arrays.toString(prices));
        System.out.println("----------------------------------------");

        prices[2] = 214.99;// we are just reassigning the value for the index number 2.
        System.out.println(Arrays.toString(prices));

    }
}
