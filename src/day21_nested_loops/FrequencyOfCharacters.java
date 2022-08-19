package day21_nested_loops;

import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        /*
        given a String determine how many times a character is in the String java
        j -1
        a-2
        v-2

         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a word or sentence");
        String word =scan.nextLine();

        String checked = "";

        for( int i = 0; i < word.length(); i++){// outer; iterating one character at a time.---> charAt(i)

            int counter = 0;// the counter should reset back to 0 for every character

            if(checked.contains("" + word.charAt(i))){// only run the counting and inner loop if the character has not already been checked
                continue;
            }

            for(int j =0; j <word.length(); j++){// inner; compare the character we are looking at 'i' with each other character in the string.---> word.charAt(j)

                if(word.charAt(i) == word.charAt(j)){// it checks
                    // iteration 1; j == j, j == a, j == v, j==a.
                    // iteration 2; a ==j,a==a, a == v, a== a.
                    // iteration 3; v ==j, v ==a, v ==v, v == a.
                    // iteration 4; a ==j, a==a, a==v, a ==a.

                    counter++;
                }
            }
            System.out.print(word.charAt(i) + " - " + counter +", ");
            checked += word.charAt(i);
        }
    }
}
