package day06_relational_operator;

public class CharIncrement {
    public static void main(String[] args) {
        char letter ='A';
        System.out.println(letter++);
        System.out.println(letter);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println("------------------------------------------");

        char letter2= 'a';
        System.out.println(++letter2); //pre increment, so the 1 is added first, then the expression finishes
        System.out.println(++letter2);
        System.out.println(++letter2);
        System.out.println(++letter2);
        System.out.println(++letter2);
        System.out.println("-------------------------------------");

        char digit ='9';// this is the character 9, the digit, not the number 9.
        System.out.println(digit--);
        System.out.println(digit--);
        System.out.println(digit--);
        System.out.println(digit--);
        System.out.println(digit--);
        System.out.println(digit);
        System.out.println((int)digit);// cast the character to an int, which mean that is prints the ascii number for that character.
        System.out.println("----------------------------------------------");
        System.out.println(65);// this is just normal int number 65.
        System.out.println((char)65);// in here we are doing casting, from int to char 65=A.

    }
}
