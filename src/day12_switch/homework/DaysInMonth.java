package day12_switch.homework;

public class DaysInMonth {
    public static void main(String[] args) {
       /* Days In Month (slightly different version than before)
        Write a program that will accept a month name and outputs how many days
        are in that month
        data:
        February: 28 days
        April, June, September, November: 30 days
        January, March, May, July, August, October, December: 31 days
        */
        String month = "April";
        int days = 0;
        switch(month){
            case "January":
                days = 31;
                System.out.println("January: " + days + " days.");
                break;

            case "February":
                days = 28;
                System.out.println("February: " + days + " days.");
                break;

            case "March":
                days = 31;
                System.out.println("March: " + days + " days.");
                break;

            case "April":
                days = 30;
                System.out.println("April" + days + " days");
                break;

            case "May":
                days = 31;
                System.out.println("May: " + days + " days.");
                break;

            case "June":
                days = 30;
                System.out.println("June: " + days + " days.");
                break;

            case "July":
                days = 31;
                System.out.println("July: " + days + " days.");
                break;

            case "August":
                days = 31;
                System.out.println("August: " + days + " days.");
                break;
            case "September":
                days = 30;
                System.out.println("September: " + days + " days.");
                break;

            case "October":
                days = 31;
                System.out.println("October: " + days + " days.");
                break;

            case "November":
                days = 30;
                System.out.println("November: " + days + " days.");
                break;

            case "December":
                days = 31;
                System.out.println("December: " + days + " days.");
                break;

        }
    }
}
