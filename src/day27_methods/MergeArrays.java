package day27_methods;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        /*
        Given a 2D int array merge the elements into one 1 D array
        Ex:
        int[][] nums = {
                    {10, 20, 30}, {5, 10, 15}
                    };
                    Output:
                    [10, 20, 30, 5, 10, 15]
         */
        int [][] num = {
                {10, 20, 30},
                {5, 10, 15}
        };

        //num.length ==2
        // num[0].length +num[1].length --> better than 6, but still not dynamic
        // to count the total number of elements I will need to loop
        int size =0;

        for(int[] eachArray : num){
            size += eachArray.length;
        }
        //purpose of this loop was to count the total number of elements, which shoud be the size of the merged array

        int[] merged = new int[size];
        int indexToStore = 0;

        for(int[] eachArray : num){
            for(int eachNum : eachArray){
                merged[indexToStore++] = eachNum; // assign the eachNum to the merged array
                //System.out.println(Arrays.toString(merged));
            }
        }

        System.out.println(Arrays.toString(merged));
    }
}
