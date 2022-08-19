package iqQuestion;

public class LongestPalindrome {
    public static void main(String[] args) {
        /*
        [IQ] Longest Palindrome
	Given a String array. Find the longest Palindrome String in your array.
		Ex:
		Input:
			["java", "longer word", "civic", "apple", "racecar", "mom", "anna"]
		Output: racecar
		Ex:
		Input: ["abc", "dna", "kevin", "joe", "lamp"]
		Output: No palindrome
         */
        String [] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna", "naan"};
        String result ="";
        for(String each : words){
            String reverse ="";

            for(int i = each.length()-1; i >= 0; i--){
                reverse += each.charAt(i);
            }

            if(reverse.equalsIgnoreCase(each)){// basically we are comparing the reverse element with original elements if it matches it will be added to the result. Ex avaJ = java(no), civic=civic(true)..
                result += each + " ";
            }

        }
        System.out.println(result.substring(0, result.lastIndexOf(" ")));
    }
}
