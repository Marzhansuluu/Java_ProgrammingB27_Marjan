package day25_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {
        int[] nums ={1,2,3};
        int[] other = nums;
        //How many array object we have? ONE. Burda iki tane variable/ reference olabilir ama ayni value/object'e isaret ediyor.
        nums[0] = 10;// I reassign the first index to 10.
        other[2] =25;// I reassign the last index to 25.
        System.out.println(Arrays.toString(nums));// nums and other reference's index 0 will be changed to 10, and second index will be changed to 25.
        System.out.println(Arrays.toString(other));


        int[] arr ={3,4,1,5,12,5,-10};
        Arrays.sort(arr);// after we sorting the array element, the object will not change.
        System.out.println(Arrays.toString(arr));


        //copOf
        int [] a ={5,10,15};
        int [] b = Arrays.copyOf(a, 3);// this is completely a new array with size 3.
        System.out.println("BEFORE");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[1] =100;
        System.out.println("AFTER");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        // we have two arrays, but
    }
}
