package Practice;
import java.util.Scanner;
public class computerBuilder {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            double price = 0; // $0
            System.out.println("Select screen size:");
            String screenSize = s.nextLine();
            switch(screenSize){
                case "13.3":
                    price = price + 200;// shorthand price +=200; // 0+200=200
                    break;
                case "15.0":
                    price = price + 300; //0+300= 300
                    break;
                case "17.3":
                    price += 400;
                    break;// optional
            }
            System.out.println("Select CPU type:");
            String CPU = s.nextLine();
            switch(CPU){
                case "i3":
                    price = price + 150; // 400+150
                    break;
                case "i5":
                    price += 250; // 400+250
                    break;
                case "i7":
                    price += 350; // 400+350
                    break;// optional
            }
            System.out.println("Select RAM size:");
            int RAM = s.nextInt();
            price = price + RAM / 4 * 50;//
            s.nextLine();
            System.out.println("Select storage type:");
            String storageType = s.nextLine();

            System.out.println("Select storage size:");
            int storageSize = s.nextInt();

            switch(storageType){
                case "HDD":
                    price = price +storageSize / 500 * 50;
                    break;
                case "SSD":
                    price = price + storageSize / 500 * 50;
            }
            //s.nextLine();
            System.out.println("Select screen resolution:");
            String screenResolution = s.next();//
            switch(screenResolution){
                case "FULLHD":
                    price = price + 100;
                    break;
                case "4K":
                    price = price + 200;
            }
            System.out.println("Final price is: $" + price);
        }
    }

