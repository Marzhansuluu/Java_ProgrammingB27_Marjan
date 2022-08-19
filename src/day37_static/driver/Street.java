package day37_static.driver;

public class Street {
        public static void main(String[] args) {

            Car bmw = new Car("X5", "James", 31283284, 'C');
            System.out.println(bmw.driver);
            System.out.println(bmw.driver.name);


        }
}
