package Practice.Arrays;

import java.util.Arrays;

public class Arrays5CopyOf {
    public static void main(String[] args) {
        //copyOf(array, newlength) copies the specified array elements and sets new length, return new array
        int [] score = {45, 55, 66, 77, 88};
        int [] score2= Arrays.copyOf(score, 8);// in here I copy the score's element size into score2. I added another 3 size also.

        int [] score3 = Arrays.copyOf(score, 3); // i copied the the first 3 element.

        System.out.println(Arrays.toString(score2));
        System.out.println(Arrays.toString(score3));
        System.out.println();

        // CopyRange(array, begIndex, endIndex); copies the specified range of the array, return new array

        char[] elements = {'A', 'B', 'C', 'D', 'E','F'};// if I want the elements between 'B' and 'D'.
        char [] someElements = Arrays.copyOfRange(elements, 1, 4);// It will give me BCD. Always the last index will be excluded. If I want to include then I need to do +1.

    }
}
