package day06_relational_operator;

public class BuyHouse {
    public static void main(String[] args) {
        int creditScore=782;
        int salary =96000;
        boolean isEligibleToGetLoan= creditScore >= 720 && salary >= 100000 || creditScore >= 740 && salary >= 80000;
        System.out.println(" Is Eligible to get loan = " + isEligibleToGetLoan);

    }
}
