package day19_for_loops.homework;

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
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine().replace(" ", "_").toLowerCase();
        String space = "";

        for(int i = 0; i < sentence.length(); i++){
            space += sentence.charAt(i)+ " ";// we put in here space because we want to put space between each character.
        }
        System.out.println(space.trim());
    }
}
