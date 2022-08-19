package day26_multi_array;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        char [] upper = {'R', 'J', 'A'};
        char [] lower = {'p', 'z', 'q', 'e'};
        char [] other = {'4', '#', '*', '$', '&' };

        char [] [] chars =new char[3][]; // {upper, lower,other}
        chars[0] = upper;// storing the char array as the first element of the 2nd array
        chars[1] = lower;
        chars[2] = other;

        //printing each inner array
        System.out.println(Arrays.toString(chars[0]));
        System.out.println(Arrays.toString(chars[1]));
        System.out.println(Arrays.toString(chars[2]));

        //printing whole 2D
        System.out.println(Arrays.deepToString(chars));// this method is used to print multidimensional arrays.
    }
}
