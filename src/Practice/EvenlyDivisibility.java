package Practice;

public class EvenlyDivisibility {
    public static void main(String[] args) {
        int number = 100;
        int remainderOf2= number % 2; // number is evenly divisible when less than 1;
        boolean isEvenlyDivisibleby2= remainderOf2 < 1;
        System.out.println(number + " is Evenly Divisible by 2 = " + isEvenlyDivisibleby2);

        int number2 = 65;
        int remainder2Of2 = number2 % 2; // 1
        boolean divisible2By2 = remainder2Of2 < 1;

        int remainderOf3= number % 3;
        boolean divisibleBy3 = remainderOf3 < 1;

        int remainderOf5 = number2 % 5;
        boolean divisibleBy5 = remainderOf5 < 1;
        System.out.println(number2 + " divisible2 By 2 = " + divisible2By2);
        System.out.println(number2 + " divisible By 3 = " + divisibleBy3);
        System.out.println(number2 + " divisible By 5 = " + divisibleBy5);

    }
}
