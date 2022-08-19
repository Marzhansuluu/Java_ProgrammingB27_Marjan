package Practice.Arrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,6,7,8};
        int[] arr3 = {1,2,3,4,5};

        // I am going to merge all these three arrays with hardcoded
        int [][] array2D = new int[3][];// I know I will have 3 arrays, thats why I put 3, but I do not know elements, thats why it is empty.
        array2D[0] = arr1;
        array2D [1] = arr2;
        array2D [2] = arr3;

        // Merging the 3 arrays again with another way
        int [][] array2Dsecond = {{1,2,3,4}, {5,6,7,8}, {1,2,3,4,5}};
        // If I want to print entire arrays always I need to use deepToString
        System.out.println(Arrays.deepToString(array2Dsecond));

        // If I want to print 2nd arrays which is {5,6,7,8}
        System.out.println(Arrays.toString(array2Dsecond[1]));

        //if I want to get 3rd array's 3 index number which 4.
        System.out.println(array2Dsecond[2][3]);
    }
}
