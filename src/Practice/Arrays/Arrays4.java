package Practice.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays4 {
    public static void main(String[] args) {
        String [] names = {"Marjan", "Nurzat", "Muhammed", "John", "Smith"};
        System.out.println(Arrays.toString(names)); // it will print whole array elements

        System.out.println();

        // sort method
        int [] nums = {1,3,4,5,6,7,8};
        System.out.println(Arrays.toString(nums));// it will just print for me
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));// it will print me smallest to largest

        System.out.println();
        // equal method
        char [] ch1 = {'a', 'b', 'c'};
        char [] ch2 = {'a', 'b', 'c'};

        System.out.println(ch1== ch2);// false because they are different objects
        System.out.println(Arrays.equals(ch1, ch2)); // //true because they have same element. If the elements order will be different, then it will not be equal. After I apply the sort method it will be equal again.


        System.out.println();
    }
}
