package day20_loops.homework;

public class RemoveDuplicate {
    public static void main(String[] args) {
        /*
        Remove Duplicates
    Write a program that can remove duplicates from a String
        Ex:
            Input: abcabc
            Output: abc
         */
        String word = "abcabc";
        String noDublic ="";
        int count = 0;

        while(word.contains("abc")){
            count++;
            word = word.replaceFirst("abc", "");

        }
        System.out.println(word);
    }
}
