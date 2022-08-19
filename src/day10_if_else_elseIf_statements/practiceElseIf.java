package day10_if_else_elseIf_statements;

import java.util.Scanner;

public class practiceElseIf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter birth year");
        int birthYear = s.nextInt();
        System.out.println("Enter current year");
        int currentYear = s.nextInt();

        int age = currentYear - birthYear;

        System.out.println("you are " + age + " years old.");
    }
}
