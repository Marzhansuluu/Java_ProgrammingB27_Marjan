package day36_custom_classes.FoodHomework;

import java.util.ArrayList;
import java.util.Arrays;

public class Food2Calling {
    public static void main(String[] args) {
        /*
    Create a separate class to create and test the Food objects



     */
        ArrayList<Food2> list1 = new ArrayList<>();
        list1.add(new Food2("apple", 10, 0.5));

        list1.add(new Food2("pear", 3, 0.6 ));

        list1.add(new Food2("pineapple", 10, 2.99 ));

        list1.add(new Food2("watermelon", 5, 6.99));

        System.out.println(list1);

        /*
        try making an array of Food objects
    	find all the Food objects that start with 'a' and print the whole information
         */

        ArrayList<Food2> list2 = new ArrayList<>(list1);
        list2.removeIf(a-> !a.name.startsWith("a"));
        System.out.println(list2);

        /*
        find all the Food objects that have a total price over 20 and print the name of the food
         */
        for(Food2 each : list1){
            if(each.totalPrice >= 20){
                System.out.println("The food's total price is over 20$: "+ each);
            }
        }


    }
}
