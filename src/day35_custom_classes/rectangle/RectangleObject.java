package day35_custom_classes.rectangle;

import day35_custom_classes.rectangle.Rectangle;

public class RectangleObject {
    public static void main(String[] args) {
        Rectangle shape1 = new Rectangle();
        shape1.base = 4.5;
        shape1.height = 8.2;
        shape1.calculateArea();// for the area I created a method and did some calculation
        shape1.calculatePerimeter();// instead of writing perimeter, I created method and did some math calculation.

        System.out.println(shape1);
    }
}
