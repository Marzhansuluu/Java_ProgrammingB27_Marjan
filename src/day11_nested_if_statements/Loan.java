package day11_nested_if_statements;

public class Loan {
    public static void main(String[] args) {
        double creditScore = 750;
        String result = creditScore > 700 ? "Loan approved" : "Loan rejected sign up for our program"; // we used "?" as an if ":" as an else
        System.out.println(result);
    }
}
