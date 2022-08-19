package day10_if_else_elseIf_statements.homework;

import java.util.Scanner;

public class PandemicYear {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 4 digit number/year");
        int year = scan.nextInt();
        String result = "";

        if (year >= 1346 && year <= 1353) {// instead of writing all the years one by one we need to use relational operators > && < inside of the if statement it gives me all the years between these years.
            result = "1346-1353: The Black Death.";

        } else if (year == 1665 || year == 1666) {
            result = "1665-1666: Great Plague of London";

        } else if (year >= 1770 && year <= 1772) {
            result = "1770-1772: Russian plague";

        } else if (year >= 1889 && year <= 1890) {
            result = "1889-1890: Flu pandemic";

        } else if (year == 1916) {
            result = "1916: American polio epidemic";

        } else if (year >= 1918 && year <= 1920) {
            result = "1918-1920: Spanish Flu";

        } else if (year == 2009 || year == 2010) {
            result = "2009-2010: H1N1 Swine Flu pandemic";

        } else if (year >= 2014 && year <= 2016) {
            result = "2014-2016: West African Ebola epidemic";

        } else if (year == 2020 || year == 2021) {
            result = "2020-2021: COVID-19";

        } else {
            result = "Any year not in those ranges: No Pandemic";
        }



    }
}
