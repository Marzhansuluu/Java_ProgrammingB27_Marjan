package day19_for_loops;

public class palindrome {
    public static void main(String[] args) {
        /*
        given a String determine if it is palindrome
        palindrome means the String is read the same forwards and backwards
        ex anna
        racecar
        maam
        abcba
         */
        String s1 = "anna"; // first I need to reverse my string from last index to first, backwards
        String reverse = "";
        for (int i = s1.length()-1; i >= 0; i--){// i is just number and using length -1 allows me to find the last index of the String, that means we can use that index to read characters.
            reverse += s1.charAt(i);

        }
        if(s1.equals(reverse)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
        System.out.println(s1.equals(reverse) ? "Palindrome" : "not palindrome");
    }
}
