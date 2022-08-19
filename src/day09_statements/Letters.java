package day09_statements;

public class Letters {
    public static void main(String[] args) {
        char letter = 'A';

        if(letter >= 'A' && letter <= 'Z'){// ascii number for the letters
            System.out.println(letter + " is an uppercase letter");
        }
        if(letter >= 'a' && letter <= 'z'){
            System.out.println(letter + " is an lowercase letter");
        }
    }
}
