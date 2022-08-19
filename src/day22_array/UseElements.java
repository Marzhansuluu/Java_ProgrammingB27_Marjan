package day22_array;

import java.util.Arrays;

public class UseElements {
    public static void main(String[] args) {
        int[] nums = {4, 5, 12};//2
        System.out.println(nums.length);// this length will tell me how many elements I have
        System.out.println(Arrays.toString(nums));// it will print for me elements [4,5,12]

        System.out.println(nums[0] + nums[1]);// int+int 4+5=9 value
        System.out.println("-----------------------------------------------------------------");

        String[] str = {"Hello", "World", "java", "code"};//4, 3
        System.out.println(str.length);// it shows me the how many elements I have
        System.out.println(str[2]); // it prints me the 3index number which 'java'
        System.out.println(str[2] + str[3]);// String + String it will print for me the index number 2 and index number 3. which javacode
        System.out.println(str[0].length()); // String method length() --> tell the number of character in the String. hello has 5 characters.


        //                 world    world       5-1 = yani wolrd kelimesinin son harfi.
        System.out.println(str[1].charAt(str[1].length()-1));// last index of the element at index 1. burda index number 1'in last characterini buluyor. yani world kelimesinin son harfi.


        String s= str[3]; // assigning the value of the 3rd index of the array in to a new String variable s. yani yeni string variable'a str variable'in ucuncu value'sunu vermis oldum.
        System.out.println(s);// this will print code. because s got its value from str 3.


    }
}
