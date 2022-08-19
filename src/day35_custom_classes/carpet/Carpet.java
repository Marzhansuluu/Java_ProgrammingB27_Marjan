package day35_custom_classes.carpet;

import day27_methods.Car;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    double totalPrice;

    public Carpet(double inputWith, double inputLength, double inputUnitPrice, boolean inputPersian){
        width = inputWith;
        length = inputLength;
        unitPrice = inputUnitPrice;
        isPersian = inputPersian;
        calculatePrice();
    }
    public void calculatePrice (){
        totalPrice = width * length * unitPrice;
        if(isPersian){
            totalPrice += 200;
        }
    }


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
