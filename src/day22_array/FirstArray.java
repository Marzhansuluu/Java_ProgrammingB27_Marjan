package day22_array;

public class FirstArray {
    public static void main(String[] args) {
        int[] nums;// declaring an int array
         nums = new int[5]; // initializing the array with 5 spaces.
        // so far this is our array: [0, 0, 0, 0, 0]
        //                            0  2  3  4  5 index numbers
        System.out.println(nums[0]);// access one element, the first element. Currently, our first (0 index number) is 0.

        // change the first element to be 10.
        nums[0] = 10; // assigning the value 10 in position 0(indexNumber) of the array

        System.out.println(nums[0]);// since we assign 10 to our array 0(indexNumber) it will print me 10.

        nums[3] = 25;
        System.out.println(nums[3]);

        // at this point OUR  WHOLE ARRAY ARE [10, 0, 0, 25, 0]

        // declaring and initializing with values;
        int[] other = {5, 7, 10, -8, 20, 12};
        //             0  1   2   3   4    5
        System.out.println(other[1]);// index of 1 is 7.
        System.out.println(other[4]);// index of 4 is 20.
        //System.out.println(other[100]);// index 100 does not exist. causes out of bounds.


    }
}
