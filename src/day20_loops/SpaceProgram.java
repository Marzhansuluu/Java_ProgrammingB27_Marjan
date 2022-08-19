package day20_loops;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {
        /*
        Space program

Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore

	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s
         */
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().replace(" ", "_").toLowerCase();
        String result= "";

        for (int i = 0; i < str.length(); i++){// i<=str.length()-1
            char letter = str.charAt(i);// chartAt method uses the number that's why we put i, i starts from 1 until the word length.

            if(letter ==' '){
                result += "_";
            }else{
                result += letter + " ";
            }
        }
        System.out.println(result.trim());
    }
}
