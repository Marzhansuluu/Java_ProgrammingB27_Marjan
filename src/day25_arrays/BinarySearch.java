package day25_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = { 6, 23, 100, 240, 2000};
        //             0   1   2    3     4
        System.out.println(Arrays.binarySearch(arr, 240));
        System.out.println(Arrays.binarySearch(arr, 2000));
        System.out.println(Arrays.binarySearch(arr, 6));
        System.out.println(Arrays.binarySearch(arr, 25));// 25 elements are not exist, it will give me -3. cunku 25 23'ten buyuk, ondan dolayi 2 ile 3 arasi oldugu icin direk 3'u aliyor.
        System.out.println(Arrays.binarySearch(arr, 500));// burda 500 4 ile 5 arasi olabilir diye direk -5 veriyor.

        System.out.println();

        int[] b= {6, 2, -1, 4, 20, -14};
        //        0  1   2  3   4    5
        System.out.println(Arrays.binarySearch(b, 4));//randomly correct
        System.out.println(Arrays.binarySearch(b, 6));
        System.out.println(Arrays.binarySearch(b, -14));
        // Binary search method does not work if the array is not sorted

        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        //   {-14, -1, 2, 4, 6, 20}
        //     0    1  2  3  4  5
        System.out.println();
        System.out.println(Arrays.binarySearch(b, 4));
        System.out.println(Arrays.binarySearch(b, 6));
        System.out.println(Arrays.binarySearch(b, -14));
        System.out.println(Arrays.binarySearch(b, 0));
        System.out.println();

        String [] words = {"hello", "world", "zebra", "water"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        //                {hello, water, world, zebra}
        //                  0       1      2      3
        System.out.println(Arrays.binarySearch(words, "hello"));
        System.out.println(Arrays.binarySearch(words, "World"));// bu bize -1 verecek cunku eger World bizim elementte olsaydi, 0 olurdu cunku buyuk harf comes first. Ondan dolayi -1 oldu.
        System.out.println(Arrays.binarySearch(words, "yellow"));// bu -4 verecek, cunku y zebradan once gelecekti, ondan dolayi 4.



    }
}
