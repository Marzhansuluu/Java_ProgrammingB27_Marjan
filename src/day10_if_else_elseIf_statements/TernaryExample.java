package day10_if_else_elseIf_statements;

public class TernaryExample {
    public static void main(String[] args) {

        //? it means if : else means

        int score = 50;
        if(score > 70){
            System.out.println("you are passing");
        }else{
            System.out.println("failing");
        }
        System.out.println("===================================================================");

        int score2 = 50;
        String result;
        if(score2 > 70){
            result = "passing";
        }else{
            result = "failing";
        }
        System.out.println(result);

        System.out.println("===================================================================");

        int score3 = 69;
        String result2 = score3 > 70 ? "passing" : "failing";// storing the result to a string variable // this string is boolean type.

        System.out.println(result2);
        System.out.println(score3 > 70 ? "passing" : "failing"); // printing the result right away

        System.out.println("====================================================");

        int n = 9;
        System.out.println(n % 2 == 0 ? "even" : "odd");


        System.out.println("==============================================");

        boolean isGreen = true;
        System.out.println(isGreen ? "Drive" : "Stop");

        System.out.println("===============================================");

        int num = 10;
        System.out.println(num > 0 ? "positive" : num < 0 ? "negative" : "zero");// in here this short version of writing/ printing; num >0 positive num < 0  negative num = 0 zero.
    }
}
