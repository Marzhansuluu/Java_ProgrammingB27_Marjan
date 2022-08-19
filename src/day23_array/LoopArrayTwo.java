package day23_array;

import java.util.Arrays;

public class LoopArrayTwo {
    public static void main(String[] args) {
        int [] num = {1,56,34};

        //In here I printed each elements in separate line
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);

        // In here I will all array elements as a whole
        System.out.println("Array elements printed as a whole: " + Arrays.toString(num));

        // In here we will print all the array element by using loop
        //for(eachNumber : num);
    }
}
