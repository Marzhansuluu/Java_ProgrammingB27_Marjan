package day07_scanner;
import java.util.Scanner;

public class ScannerSalaryHourlyRate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salary = scan. nextDouble();
        int hours = scan.nextInt();

        double hourlyRate = salary / (hours *52);

        System.out.println("hourlyRate = " + hourlyRate);
    }
}
