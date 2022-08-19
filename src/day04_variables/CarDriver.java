package day04_variables;

public class CarDriver {
    public static void main(String[] args) {
    String driverName="John";
    int carModel=2022;
    String licenseNumber="BL09090";
    char licenseClass='D';
    int speed=80;
    boolean isAutomatic=true;
        System.out.println("The driver's name is " + driverName + ", and his car model is " + carModel + " and driver's license number is " + licenseNumber + ".");
        System.out.println(" And the driver's license class is " + licenseClass + " and when he was driving his speed was " + speed +".");
        System.out.println(" Is the car is automatic? " + isAutomatic);

        System.out.println("=================================================================");

        String report= driverName+ " and his car model "+ carModel+ driverName+"s driver license is "+licenseNumber+ "\n"+driverName+"s license class is "+ licenseClass+ " \nand "+driverName+" drives with speed limit "+ speed+ "is his car automatic? "+isAutomatic;
        System.out.println(report);

    }

}
/*create a class CarDriver
create a main method

    declare and assign these variables with the most appropriate datatypes:
        driver name, car model, license number, license class, speed, is automatic

    create a summary of the information and print it. Be creative

 */
