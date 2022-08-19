package day10_if_else_elseIf_statements;

public class IfWithNoBrackets {
    public static void main(String[] args) {
        if(3 < 9){// true
            System.out.println("First");
            System.out.println("Second");
        }
        if(3 < 9)
            System.out.println("third");// this is the line executed when the if statement is true
            System.out.println("fourth");// this is not a part of the if statement

        System.out.println("====================================================");

        if(5 % 2 == 0)
            System.out.println("even");// when you do not use bracket only this line will work the else and other print will not work.
        else
            System.out.println("odd");

        System.out.println("===================================================");

        char a = 'a';
        if(a == 'a')
            System.out.println("letter a");
        else if(a == 'b')
            System.out.println("letter b");
        else if(a =='c')
            System.out.println("letter c");
        else
            System.out.println("other");
    }
}
