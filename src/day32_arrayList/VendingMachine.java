package day32_arrayList;

import my_utils.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
       // ArrayList<String>drinks =new ArrayList();
        //drinks.addAll(Arrays.asList("Soda", "Juice", "Water", "Coffee", "Milk"));
       // System.out.println(drinks);


        Scanner input = new Scanner(System.in);
        // Line 13 and line 8,9 are same
        ArrayList<String>drinks =new ArrayList(Arrays.asList("Soda", "Juice", "Water", "Coffee", "Milk"));
        System.out.println("Welcome. Which drink would you like?");
        String selection = input.next();
        StringUtil.fixFormat(input.next());

        if(drinks.contains(selection)){
            System.out.println(selection + " is vending");
        }else{
            System.out.println(selection + " is not in the vending machine");
        }
    }
}
