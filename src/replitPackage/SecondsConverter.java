package replitPackage;
import java.util.Scanner;
public class SecondsConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputSeconds;

        System.out.println("Enter seconds: ");
        inputSeconds = scan.nextInt();
        int seconds = inputSeconds % 60; //
        int hours = inputSeconds / 60; //
        int minutes = inputSeconds % 60;
        hours = hours /60;
        System.out.println( hours+ " hours " + minutes + " minutes, and  " + seconds + " seconds.");
    }



}
