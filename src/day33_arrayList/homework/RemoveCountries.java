package day33_arrayList.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountries {
    public static void main(String[] args) {
        /*
        Remove Countries

Create a method that will take an ArrayList of countries and returns an ArrayList of countries that have a length of less than 7

@param nums - The given ArrayList of numbers
@return - ArrayList of numbers

Ex:
Input: "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"
Output: "Japan", "Korea", "Turkey", "Canada"
         */

        ArrayList<String> country = new ArrayList<>(Arrays.asList("Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"));

        ArrayList<String> byLength = new ArrayList<>(country);
        byLength.removeIf( name -> name.length() > 7);
        System.out.println(byLength);


    }
}
