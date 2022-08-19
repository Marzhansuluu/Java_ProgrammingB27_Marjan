package day08_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeeReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // full name, job title, salary, company HQ located, full time. Create a program that will ask the user to enter a salary (double) and number of hours (int) calculate the hourly rate. hourly rate = salary/ (hours weekly *52)

        System.out.println("Enter full name: ");
        String fullName = input.nextLine();

        System.out.println(" Enter job title: ");
        String jobTitle = input.nextLine();

        System.out.println("What is your hourly rate? ");
        double hourlyRate = input.nextDouble();

        System.out.println("What is the average number of hours in a week? ");
        int hours = input.nextInt();

        double salary = hours * 52 * hourlyRate;

        input.nextLine();
        System.out.println("Where is the company HQ? ");
        String hqLocation = input.nextLine();

        System.out.println("Are you full time? : ");
        boolean fullTime = input.nextBoolean();



        String report = fullName + " is a " + jobTitle + " they make " + salary + " because they they are full time: " + fullTime + ". The HQ company is located in : " + hqLocation;

        System.out.println(report);

    }
}
