package day02_print_statements;

public class EscapeExamples {
    public static void main(String[] args) {
        System.out.println("Today is: Friday"); //this is just normal print
        System.out.println("Today is:\"Friday\"");// this is with quotation mark today is "Friday"
        System.out.println("\\"); /* this is to put the backslash. when do we use it? when I want to print certain character
                                    that exist in java syntax we need to use the escape sequence syntax
                                    */
        System.out.println("\tHello"); // it will tab once
        System.out.println("\t\t\t Hello"); // it will tab three times
        System.out.println("shopping list: \n1)juice\n2)Chips\n3)water"); // it will create each item in new line
        System.out.println("shopping list:\n\t1)juice\n\t2)chips\n\t3)water"); /* it will create each item in new line and will tab once
        */
    }
}
