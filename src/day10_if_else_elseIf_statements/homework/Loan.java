package day10_if_else_elseIf_statements.homework;

public class Loan {
    public static void main(String[] args) {
        String eligible = "";

        int creditScore= 780;

        if(creditScore >=700){
            eligible ="Loan approved";
        }else{
            eligible = "Loan rejected. Sign up for our credit program";
        }
        System.out.println(eligible);

        /*
        create a class Loan
declare and assign a credit score variable
try to use ternary to determine of you are eligible for a loan
you are eligible if you have a credit score of 700 or above
if you are eligible print "loan approved"
otherwise print "loan rejected. Sign up for our credit program"
         */
    }
}
