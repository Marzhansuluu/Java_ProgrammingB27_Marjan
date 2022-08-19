package day06_relational_operator;

public class Store {
    public static void main(String[] args) {
        int numberOfItems = 0;
        double price = 0.0;
        System.out.println("Go and pick up some coffee");
        System.out.println("Itemas in the cart: " + ++numberOfItems);// in our cart will have 1 item.
        price+= 3.55;// price price+3.55. += is basically I am adding this is shorthand
        System.out.println("Go pick up some milk");
        System.out.println("add 1 gallon of milk " + ++numberOfItems);// in my cart i will have 2 items.

        price+=5.99; //price=price+5.99
        System.out.println("Your total is $" +price);


    }
}
