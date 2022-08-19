package day20_loops;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();

        int upperCase = 0, lowerCase =0, number =0;

        for(int i = 0; i < word.length(); i++){
            char eachLetter = word.charAt(i);

            if(eachLetter >= 'A' && eachLetter <= 'Z'){
                upperCase++;
            }else if(eachLetter >= 'a' && eachLetter <= 'z'){
                lowerCase++;
            }else if(eachLetter >= '0' && eachLetter <= '9'){
                number++;
            }

        }
        System.out.println("upperCase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("number = " + number);
    }
}
