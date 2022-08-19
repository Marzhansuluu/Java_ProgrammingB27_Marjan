package day26_multi_array;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        String [][] cydeo = {
                            {"Alen", "Tina", "Nargiza"},
                            {"Anam", "Baz", "Busra", "Ostap"},
                            {"Rabia", "Shahad"},
                            {"Ketino", "Eylul", "Nadia"}
        };

        System.out.println(Arrays.deepToString(cydeo));//prints the whole 2D array
        System.out.println(cydeo.length);// 4  how many inner, 1d array is there--> Howe many elements in the 2D array
        System.out.println(cydeo[2].length);//2 (Rabia, Shahad) How many elements in the array at index 2.
        System.out.println(cydeo[0][3]);//Nargiza. Accessing one specific String element from the inner array at the index 0 and giving back the element at index 3.
        System.out.println(Arrays.toString(cydeo[1]));//Anam, Baz, Busra, Ostap. printing the whole inner element array at index 1.

        System.out.println();
        // how to loop through each inner array

        for(String[] eachInner : cydeo){ // to loop through a 2d array, the element's type is a 1d array
            System.out.println(Arrays.toString(eachInner));
        }

        System.out.println();
        // how to loop through each name

        for(String[] eachInner : cydeo){
            for(String eachName : eachInner){
                System.out.println(eachName);
            }
        }

        System.out.println();
        // how to loop through each name and print the last letter in uppercase

        for(String[] eachInner : cydeo){
            for(String eachName : eachInner){
                System.out.println(eachName.substring(eachName.length() - 1).toUpperCase());
            }
        }




    }
}
