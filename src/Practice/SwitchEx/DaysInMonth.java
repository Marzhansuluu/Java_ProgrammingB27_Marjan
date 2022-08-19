package Practice.SwitchEx;

public class DaysInMonth {
    public static void main(String[] args) {
        /*
        Days In Month (slightly different version than before)
Write a program that will accept a month name and outputs how many days
are in that month
data:
February: 28 days
April, June, September, November: 30 days
January, March, May, July, August, October, December: 31 days
         */
        String month = "May";
        switch (month){

            case"February":
                System.out.println(month+ ": 28 days");
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case"October":
            case "December":
                System.out.println(month + " 31 days");
                break;
            case "April":
            case"June":
            case "September":
            case "November":
                System.out.println(month+ " 30 days");


        }
    }
}
