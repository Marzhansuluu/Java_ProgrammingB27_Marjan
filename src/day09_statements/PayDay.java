package day09_statements;

public class PayDay {
    public static void main(String[] args) {
        double hourlyRate = 60;
        int hoursPerWeek= 50;// I worked in a week
        double overTimeRate = 1.5;
        double netPay;

        if(hoursPerWeek > 40){
            // we need to do overtime calculation
            int overTimeHours= hoursPerWeek - 40;/* in order to find the overtime hours I need to do subtraction. From The hours that I worked in a week minus 40(why 40 because the national rate for week is 40).*/

            netPay = hourlyRate * 40; // calculate the normal pay for 40 hours in a week.
            netPay += hourlyRate * overTimeHours * overTimeRate; //total earned from overtime netPay = netPay + hourlyRate * overTimeHours * overTimeRate;

        }else{
            // worked under or equal 40 hours, so no overtime
            netPay = hourlyRate * hoursPerWeek;
        }

        System.out.println("Net pay " + netPay);

    }
}
