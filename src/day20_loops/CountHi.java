package day20_loops;

public class CountHi {
    public static void main(String[] args) {
        // counting how many times hi is the string
        String s = "ahibhishibhifhihiihinhifhishinfhighi";
        // approach 1: while loop and delete the first occurrence each time

        int count = 0;
        while(s.contains("hi")){
            System.out.println(s);
            count++;// it will count how many times hi occurred.
            s = s.replaceFirst("hi", "");// if i will just use replace the first hi, then rerun again then deletes again, it will continue until no hi left

        }
        System.out.println("hi contains: " + count);

        /* approach 2:
        for loop to check one index at a time, but when there is an h we will check another index.

         */
        String s2= "ahibhifhidhirhiwhiqhi";
        int count2 = 0;
        for (int i = 0; i < s2.length(); i++){
            if(s2.charAt(i) == 'h' && s2.charAt(i+1) == 'i'){// charAt current character is h next character is it i, we are checking this one.
                count2++;
            }
        }
        System.out.println("hi occurred: " + count2);

        // approach 3:
        //using indexes to check every 2 characters.
        String s3 ="hjkghinnhinnnhi";
        int count3 =0;
        for(int i =0; i< s3.length()  -1; i++){
            if(s3.substring(i, i+2).equals("hi")){
                count3++;
            }
        }
        System.out.println(count3);
    }
}
