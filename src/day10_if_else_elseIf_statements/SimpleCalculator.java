package day10_if_else_elseIf_statements;

public class SimpleCalculator {
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 24;
        char operator = '+';// check the last println
        double result =0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*' || operator == 'x') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 / num2;
        } else if (operator == '%') {
            result = num1 % num2;
        }else{
            System.out.println("Invalid operator");
        }
        System.out.println("" + num1 + " " + operator + " " + num2 + " = " + result);// we are trying to get result num1 +num2 by using char operator. we put "" before purring the 1st number because we want the print is concatenation not the addition. if we won't put the it it will take "+" sign ascii number.
    }
}
