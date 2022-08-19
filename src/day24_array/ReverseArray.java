package day24_array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        /*
        Write a program that will reverse the order of any given array
        Ex; input
        [1,2,3,4,5]
        output
        [5,4,3,2,1]
         */
        int []arr = {1,2,3,4,5};
        int [] reverse = new int[arr.length];// we want to store arr elements into reverse array.

        for(int i = arr.length-1, y = 0; i >= 0; i--, y++){// i goes down, y goes up. We use y because we need to store the value,
            System.out.println(arr[i]);// it will print me the reverse array each of them in different line
            reverse[y]=arr[i];// eger bul jerde reverse[i] =arr[i] jazganibizda, bizge arr'din eski valuesunu berip koyotle, owondoy kilbaw uchun biz y dep jazip aldik.

            // use i variable that is going backwards to read from the original array-index for arr array
            // use y variable that is going forward to store into the reverse array - index for reverse array

        }


        System.out.println(Arrays.toString(reverse));

        System.out.println("------------------------------------------------------");
        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }

        /*int i = arr.length-1;
        int y =0;
        while(i >= 0){
            i --;
            y++;*/

    }

}
