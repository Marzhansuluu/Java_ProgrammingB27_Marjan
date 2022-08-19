package day22_array;

import java.util.Arrays;

public class StringCitiesArray {
    public static void main(String[] args) {
        // Cities as separate String variables.
        String city1 = "Chicago";
        String city2 = "West Palm";
        String city3 = "Miami";
        String city4 = "New York";
        String city5 = "Toronto";
        String city6 = "Houston";

        // make an array to store the cities
        String[] cities = {"Chicago", "West Palm", "Miami", "New York", "Toronto", "Houston"}; // since I know my values, I can put like this

        // access each city one at a time
        System.out.println(cities[0]);// Chicago
        System.out.println(cities[1]);// West Palm
        System.out.println(cities[2]);// Miami
        System.out.println(cities[3]);// New York
        System.out.println(cities[4]);// Toronto
        System.out.println(cities[5]);// Houston

        System.out.println("-----------------------------------------------------------");

        // print the whole array in once
        System.out.println(cities);// this is not readable

        System.out.println("-------------------------------------------------------");

        System.out.println(Arrays.toString(cities)); // arrays.toString(cities); --->return your array object as in a String
    }
}
