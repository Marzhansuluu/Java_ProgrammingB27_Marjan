package Practice.StringEx;

import java.util.Scanner;

public class MiddleCharEven {
    public static void main(String[] args) {
        /*
        [Middle char]
        Given a String, write a program to display the middle character of a string
        a) If the length of the string is even there will be two middle char
        b) If the length of the string is odd there will be one middle char

        ex; elephant
        output; the middle chars =:ph
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        if(word.length() % 2 == 1){
            int middle = word.length() / 2;
            System.out.println("The middle character: " + word.charAt(middle) );

        }else{
            int middle = word.length() / 2;
            System.out.println("The middle characters are: " + word.charAt(middle-1) + word.charAt(middle));
        }
    }

}
