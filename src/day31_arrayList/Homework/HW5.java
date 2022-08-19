package day31_arrayList.Homework;

import java.util.ArrayList;

public class HW5 {
    /*
         Create an ArrayList of Double elements
         Fill the ArrayList with some values
         Find the max element from the ArrayList
      */
    public static void main(String[] args) {

        ArrayList<Double> values = new ArrayList<>();

        for (double i = 0; i <= 10; i++) {
            values.add(i);
        }
        System.out.println(values);

        double max = 0;

        for (int i = 0; i < values.size(); i++) {

            if (max < values.get(i)){
                max = values.get(i);
            }
        }
        System.out.println(max);
    }
}
