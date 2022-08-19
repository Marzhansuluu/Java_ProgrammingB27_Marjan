package day20_loops;

import java.util.Scanner;

public class MultipleEnd {
    public static void main(String[] args) {
        /*
        Multiply End

Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????

	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa
         */
        Scanner s = new Scanner(System.in);
        // String str = s.nextLine(); we can use like this too
        String str = "hello";// we can do hardcoded
        int end = 3;// it is hard coded. we just declare 3 because last character in the string i want that character to print 3 more times.
        //int end = s.nextInt();

        for (int i = 0; i < end; i++ ){// int i = 1; i <= end;
            str += str.charAt(str.length() - 1);// this will give us the last index number. With help for loop our last index will print 3 more times.
        }
        System.out.println(str);
    }
}
