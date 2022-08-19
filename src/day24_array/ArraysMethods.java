package day24_array;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] nums ={ 32, 5, -9, 3, 1, 20};
        System.out.println(Arrays.toString(nums));

        // sorting
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("------------------------------------------------");

        // max and min
        System.out.println("min: " + nums[0]);
        System.out.println("Max: " + nums[nums.length-1]);

        System.out.println("-------------------------------------------------------");

        String [] str = {"Hello", "world", "4four", "#Zebra", "apple", "1aaaaa", "abc"};
        System.out.println(Arrays.toString(str));
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        System.out.println("-----------------------------------------------");

        int[] a = {1,2,3};
        int [] b = {1,2,3};
        int [] c = {1,2,4};
        int [] d = {3,2,1};

        System.out.println(Arrays.equals(a,b));// true
        System.out.println(Arrays.equals(a,c));// false
        System.out.println(Arrays.equals(a,d));// they are not equal

        Arrays.sort(d);
        System.out.println(Arrays.equals(a,d));// now it is equal after sorting

    }
}
