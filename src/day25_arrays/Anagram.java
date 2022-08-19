package day25_arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String word1 ="listen";
        String word2 = "silent";

        char[] first = word1.toCharArray();
        char[] second = word2.toCharArray();
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        Arrays.sort(first);
        Arrays.sort(second);

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        if(Arrays.equals(first, second)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

        System.out.println(Arrays.equals(first, second) ? "Anagram" : "Not Anagram");
    }
}
