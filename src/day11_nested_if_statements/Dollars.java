package day11_nested_if_statements;

public class Dollars {
    public static void main(String[] args) {
        // 1 dollar and you get back change. quarters,dimes, nickels  and pennies.

        int money = 97; // where 100 is 1 dollar
        int quarter = money/ 25;
        money %= 25;   //money = money % 25; we did this equation to find out the remainder of 97 cents.
        int dimes = money/ 10;
        int nickles = money / 5;
        money %= 5; // money = money % 5
        int pennies = money;

        System.out.println("Change: ");
        System.out.println(quarter + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickles + " nickles");
        System.out.println(pennies + " pennies");
    }
}
