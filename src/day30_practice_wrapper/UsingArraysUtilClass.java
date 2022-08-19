package day30_practice_wrapper;

import my_utils.ArrayUtil;

import java.util.Arrays;

public class UsingArraysUtilClass {
    public static void main(String[] args) {
        int num = ArrayUtil.min(4,2,1,5,1,-1,2,4,5,-2);// more dynamic
        System.out.println(num);
        System.out.println(ArrayUtil.min(5,3,4,2,3,4,4,5));// this is hardcoded

        System.out.println(ArrayUtil.max(5,3,4,2,3,4,4,5));

        int [] a = {45,2,6,2,6,23,83,12};
        System.out.println(ArrayUtil.max(a));

        System.out.println(ArrayUtil.max(new int [] {4,5,2,5,2}));

        int [] b = {4,5,12,5,14};
        System.out.println(ArrayUtil.contains(b,13));
        System.out.println(ArrayUtil.contains(b, 5));


        System.out.println("Index of");
        int [] c = {4,2,5,1,6};
        System.out.println("index of 5: " + ArrayUtil.indexOf(c, 5));

        System.out.println("index of 7: " + ArrayUtil.indexOf(c, 7));

        System.out.println("Overload");
        int [] d = {4,5,1,6,1,6,3,5,4,1};
        System.out.println("index of 6: " + ArrayUtil.indexOf(d,6));
        System.out.println("index of 6: " + ArrayUtil.indexOf(d,6, 4));// 4 is the starting point

        int firstIndex = ArrayUtil.indexOf(d,6);//  same as line 39.
        int secondIndex = ArrayUtil.indexOf(d,6, firstIndex+1); // same as line 40.

        System.out.println("------------------------------------------\nAdd element method");

        String [] words = {"java", "is", "the", "best"};// I want to add:language into the array

        String[] allWords = ArrayUtil.addElement(words, "language");
        System.out.println(Arrays.toString(allWords));


        System.out.println("------------------------------------------\nAdd element method");

        String[] strs  = {"today", "is", "monday"};
        String[] other = {"no", "softskill", "today"};

        String [] multipleAdded = ArrayUtil.addElement(strs,other);
        System.out.println(Arrays.toString(multipleAdded));
    }

}
