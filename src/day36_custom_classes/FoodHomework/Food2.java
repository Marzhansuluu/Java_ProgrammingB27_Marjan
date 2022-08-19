package day36_custom_classes.FoodHomework;

public class Food2 {
    /*
     create a class called Food

        - data:

            name, quantity, unit price, total price
*/
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    /*
        - constructor

            - create a constructor that creates a Food object with the name

            - create a constructor that creates a Food object with the name and quantity

            - create a constructor that creates a Food object with the name, quantity, and unit price
            	-> call calculatePrice() method here
*/
    public Food2(String name, int quantity, double unitPrice){
        this.name = name;
        this.quantity = quantity;
        this.unitPrice =unitPrice;
        calculatedPrice();


    }
    /*
        - method:
        	- calculatePrice(): multiple the quantity by unit price and assign the value to the total price
*/
    public void calculatedPrice(){
        totalPrice = quantity * unitPrice;
    }
    /*
            - toString()
                print all the Food information
*/
    public String toString(){
     return "\nName :" + name +"\nQuantity: " + quantity + "\nUnit Price: " + unitPrice + "\nTotal price: " + totalPrice +"\n-------------------------";
    }

}
