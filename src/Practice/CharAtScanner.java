package Practice;

import java.util.Scanner;

public class CharAtScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char character = scan.next().charAt(7);// muhammed karaas= m=0, u=1, h=2, a=3, m=4, m=5, e=6, d=7, space=8, k=9, a=

        boolean letters = character >= 'A' && character <= 'Z' || character >= 'a' && character <= 'z';// letter
        boolean numbers = character >= '0' && character <= '9';// number
        boolean specialCharacter = character >= 33 && character <= 47 || character >= 58 && character <= 64;// these numbers are from ascii


        if (letters) {
            System.out.println("it is a letter");
        } else if (numbers) {
            System.out.println("it is a number");
        } else if (specialCharacter) {
            System.out.println("specialCharacter ");// + specialCharacter);

            }

        }
    }

