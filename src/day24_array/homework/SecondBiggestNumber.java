package day24_array.homework;

import java.util.Arrays;

public class SecondBiggestNumber {
    public static void main(String[] args) {
        /*
        [IQ] Second Biggest Number

Given an Array of numbers. Find and print the 2nd biggest number.

Note the 2nd biggest should be unique meaning it should be different from the max number

Example:
	Input:
		[4,3,1,4,5,2,4,8,4,8]
	Output:
		5
         */
        int [] num = {4,3,1,4,5,2,4,8,4,8};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println("The second biggest number is: " + num[num.length-2]);
    }
}
