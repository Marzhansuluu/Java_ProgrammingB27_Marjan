package day28_methods;

public class DayInWeek {

    public static void main(String[] args) {
        System.out.println(dayInWeek(4));
        System.out.println(dayInWeek(7));

        switch (dayInWeek(1)){
            case "Mon":
            case "Fri":
                System.out.println("Have a full day of java");
                break;
            case "Wed":
                System.out.println("Office hours");
                break;
            case "Tues":
            case "Thur":
                System.out.println("Half java, half soft skills");
                break;
            case "Sat":
            case "Sun":
                System.out.println("Off");
        }
    }

    public static String dayInWeek(int day){
        String []days = {"Mon", "Tues", "Wed", "Thur", "Fri", "Sat", "Sun"};
        return days[day -1]; // convert the number to index
    }
}
