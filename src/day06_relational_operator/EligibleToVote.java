package day06_relational_operator;

public class EligibleToVote {
    public static void main(String[] args) {
        int age =21;
        boolean isCitizen = true;
        boolean hasCriminalBackground = false;
        boolean over18 = age >= 18;
        boolean isEligible = isCitizen && over18 && hasCriminalBackground; // true && true && false ---> true.
    }
}
