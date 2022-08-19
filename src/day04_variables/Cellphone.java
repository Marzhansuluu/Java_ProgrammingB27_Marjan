package day04_variables;

public class Cellphone {
    public static void main(String[] args) {
        String brand = "Apple";
        String model = "Iphone X";
        String color = "Rose Gold";
        double price = 1000.99;
        boolean hasCamera = true;
        int memory =128;
        char sim = 'A';
        System.out.println("\t\tPhone Information:\nBrand: " + brand);
        System.out.println(model + " in " + color);
        System.out.println("With " + memory + " gb the price is $" +price);
        System.out.println("Sim type: " + sim + " and has a camera: " +hasCamera);

        //alternative solution: to putt all print above all in one line.look below line for all print in one line.
        String report= "\t\tPhone Information:\nBrand: " + brand +"\n" + model + " in " + color +"\nWith " + memory + " gb the price is $" +price +"\nSim type: " + sim + " and has a camera: " +hasCamera;
        System.out.println(report);
    }
}
