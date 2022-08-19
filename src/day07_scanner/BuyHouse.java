package day07_scanner;

public class BuyHouse {
    public static void main(String[] args) {
        int creditScore = 720;
        int salary = 100_000;
        boolean option1= creditScore >= 720 && salary >= 100_000; // true
        boolean option2= creditScore >= 740 && salary >= 80_000; // false

        boolean isEligibleToGetLoan = option1 || option2;// we used OR thats why one of them has to be true in order to get a loan.

        System.out.println("isEligibleToGetLoan = " + isEligibleToGetLoan);
    }
}
