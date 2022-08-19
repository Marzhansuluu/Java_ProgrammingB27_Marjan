package day06_relational_operator;

public class RelationalTasks {
    public static void main(String[] args) {
        int currentSpeed=45;
        int speedLimit=50;

        boolean isSpeeding= currentSpeed>speedLimit;
        System.out.println("is Speeding = " + isSpeeding);


        System.out.println("---------------------------------------------");
        int number = -4;
        boolean isPositive= number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number==0;
        System.out.println("isZero = " + isZero);
        System.out.println("isNegative = " + isNegative);
        System.out.println("isPositive = " + isPositive);
        System.out.println("-------------------------------------------------");

        int num = 20;
        boolean isOdd = num % 2 != 0; // num % 2 ==1; isEven !=true
        boolean isEven= num% 2 == 0;
        System.out.println("isOdd = " + isOdd);
        System.out.println("isEven = " + isEven);



    }
}
