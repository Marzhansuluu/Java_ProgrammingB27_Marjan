package day13_switch_string;

public class DaysInMonth {
    /* Days In Month (slightly different version than before)
        Write a program that will accept a month name and outputs how many days
        are in that month
        data:
        February: 28 days
        April, June, September, November: 30 days
        January, March, May, July, August, October, December: 31 days
        */
    public static void main(String[] args) {
        String month = "May";
        String print;

        switch (month){
            case "February":
                print = "28";
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                print = "30 days";
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October" :
            case "December":
                print = "31 days";
                break;
            default:
                print = "Invalid month";
        }
        System.out.println(print);
    }

}
