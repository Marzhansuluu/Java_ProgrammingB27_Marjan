package day29_methods;

import day28_methods.Numbers;

import java.util.Scanner;

public class TestCalling {
    public static void main(String[] args) {
        int[]arr = {3,1,4,5};
        int sum  = ExtraPractices.sumFromArray(arr);
        System.out.println(sum);

        double value = ExtraPractices.currencyConverter("won", 130);
        System.out.println(value);

        Numbers.checkNum(9);
    }
}
