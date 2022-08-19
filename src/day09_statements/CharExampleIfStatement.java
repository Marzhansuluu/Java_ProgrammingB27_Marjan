package day09_statements;

public class CharExampleIfStatement {
    public static void main(String[] args) {
        char letter = 'A';
        if(letter >= 'P'){
            System.out.println("Your char is Letter");
        }else if(letter <= 67){
            System.out.println("Your char is number");
        }else if(letter == '$'){
            System.out.println("Your char is special character");
        }
        /*
        create a char variable letter. Find and print if the character is a
letter, number, or special character
ex: p
letter
ex:
6
number
ex:
$
speical character
         */
    }
}
