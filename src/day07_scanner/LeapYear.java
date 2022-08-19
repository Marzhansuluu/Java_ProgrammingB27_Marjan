package day07_scanner;

public class LeapYear {
    public static void main(String[] args) {
        /*
        create a class LeapYear

    declare and assign a year variable
    check if the year is a leap year, a year will be a leap year if it is divisible by 4
         */
        int year = 2030;
        boolean isLeapYear = year % 4 == 0; // we can say boolean isLeapYear = year % 4 <1;
        System.out.println("isLeapYear = " + isLeapYear);


    }
}
