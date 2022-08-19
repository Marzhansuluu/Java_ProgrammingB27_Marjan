package day10_if_else_elseIf_statements;

public class LetterType {
    public static void main(String[] args) {
        char c = '7';
        boolean isLetter = (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'); // this parenthesis will improve the readibility of the code. In order to check the c letter we need to compare always with a and z  with upper case or lower case.

        boolean isNumber = c >= '0' && c <= '9';// char can hold only single digit number when we assign.

        if(isLetter){
            System.out.println(c + " is a letter");
        }
        if (isNumber){
            System.out.println(c + " is a number");
        }
        if(!isLetter && !isNumber){
            System.out.println(c + " is a special character");
        }
    }
}
