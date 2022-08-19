package day32_arrayList.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HidePassword {
    public static void main(String[] args) {
        /*
        Hide passwords
Given an ArrayList of passwords (String). Hide each password in a star (*)
format where each character is a star and print the ArrayList of hidden
passwords
Ex:
Input:
{"one", "hi", "hold"}
Output:
[ ***, **, **** ]
         */

        Scanner scan = new Scanner(System.in);
        ArrayList<String> password = new ArrayList<>(Arrays.asList(scan.next(),scan.next(),scan.next() ) );
        ArrayList<String> star = new ArrayList<>();

        for (String each : password) {// each = "apple", "two"
            for (int i = 0; i < each.length(); i++) {
                each = each.replace(each.charAt(i), '*');// each = "apple" = *****, "two" = ***
            }

           star.add(each);

        }
        System.out.println(password);
        System.out.println(star);
    }
}
