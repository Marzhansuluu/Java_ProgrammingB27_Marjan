package day20_loops.homework;

import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        /*
        Characters in String
    Given a String print the ascii value codes for each character
        Ex:
            Input:
                java
            Output:
                106 97 118 97
         */
        Scanner scan =new Scanner(System.in);
        String word = scan.nextLine();
        char result = 0;

        for(int i = 0; i < word.length(); i++){
            result = word.charAt(i);

            System.out.print(result + " = ");
            System.out.println(result + 0);
        }



    }
}
