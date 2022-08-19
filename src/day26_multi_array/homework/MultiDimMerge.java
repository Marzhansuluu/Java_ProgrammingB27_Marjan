package day26_multi_array.homework;

import java.util.Arrays;

public class MultiDimMerge {
    public static void main(String[] args) {
        /*
        Given a 2D int array merge the elements into one 1D array
Eint [][] nums = {
                {10, 20, 30}, {5, 10, 15}
        };
       Output:
              [ 10, 20, 30, 5, 10, 15 ]
         */
        int [][] nums = {
                {10, 20, 30},
                {5, 10, 15},
        };
//        int result = 0;
//        int [] nums2 =new int[0];
//        for (int[] eachArray : nums) {
//            for(int[] eachElement : eachArray) {
//                nums2 = Arrays.copyOf(nums2, result+1);
//                nums2[result] = eachElement;
//                result++;
//
//            }
//
//        }
        int result=0;
        int[] nums2=new int[0];

        for (int[] eachArray : nums) {
            for (int eachElement : eachArray) {
                nums2= Arrays.copyOf(nums2,result+1);
                nums2[result]=eachElement;
                result++;
            }
        }
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums2));

    }
}
