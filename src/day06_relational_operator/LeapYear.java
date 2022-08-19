package day06_relational_operator;

public class LeapYear {
    public static void main(String[] args) {
        int year=1988;
        boolean leapYear= year % 4 ==0; // I divided 1988/4 there is no remainder this means this is leap year.

        System.out.println(leapYear);
    }
}
