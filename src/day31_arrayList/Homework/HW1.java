package day31_arrayList.Homework;

import java.util.ArrayList;

public class HW1 {
    public static void main(String[] args) {
        /*
        Practice flow:

Create an ArrayList of Strings
add these elements:
    add Hat
    add Shoes
    add Jacket in middle of Hat and Shoes
    add Towel in the beginning
    add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made
         */

        ArrayList<String> name = new ArrayList<>();
        name.add("Hat");
        System.out.println(name);
        name.add("Shoes");
        System.out.println(name);
        name.add(1, "Jacket");
        System.out.println(name);
        name.add(0, "Towel");
        System.out.println(name);
        name.add(1, "Car");
        System.out.println(name);
    }
}
