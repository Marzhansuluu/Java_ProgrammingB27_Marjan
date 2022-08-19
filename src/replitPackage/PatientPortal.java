package replitPackage;
import java.util.Scanner;
public class PatientPortal {

        public static void main(String[] args) {
            //Enter your code here
            Scanner scan = new Scanner(System.in);


            System.out.println("Please enter your first name");
            String firstName = scan.nextLine();

            System.out.println("Please enter your last name");
            String lastName = scan.nextLine();

            // this part is already provided DO NOT CHANGE
            System.out.println("Enter your email");
            String email = scan.nextLine();


            System.out.println("Enter your street");
            String street = scan.nextLine();


            // continue for city
            System.out.println("Please enter your city ");
            String city = scan.nextLine();

            System.out.println("Please enter your state");
            String state = scan.nextLine();

            System.out.println("Please enter your zipcode");
            int zipCode = scan.nextInt();

            System.out.println("Please enter your work phone number");
            long workPhoneNumber = scan.nextLong();


            System.out.println("Please enter your personal phone number");
            long personalPhoneNumber = scan.nextLong();

            System.out.println("Please enter your age");
            int age = scan.nextInt();



            System.out.println("Please enter your height");
            double height = scan.nextDouble();

            System.out.println("Please enter your weight");
            double weight =scan.nextDouble();

            System.out.println("Are you married?");
            boolean isMarried = scan.nextBoolean();

            System.out.println("Welcome to the patient portal!\nPlease enter your personal information\nFull name: " + firstName + " " + lastName + "\n" + "Address: " + street + " " + city + " " + state + "\nContact: work phone number " + workPhoneNumber + ", personal phone number: " +personalPhoneNumber + ", email: " + email + "\nAge: " + age + "\nHeight: "+ height + "\nWeight:" + weight + "\nMarried: " + isMarried);
        }
}
