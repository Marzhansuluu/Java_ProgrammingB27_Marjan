package day19_for_loops;

public class countLetter {
    public static void main(String[] args) {
        //frequency
        // word --> java
        // how many 'a' characters?.
        String word = "i love a java language and I like an apple as a fruit";

        int count = 0;// initially our count is 0 because we do not know how mnay time 'a' letter used.
        for(int i = 0;  i < word.length(); i++){// if we want to check the last index we can do this way, if I will put i<= word.length() then it will be wrong.in that case I need to do -1.
            if(word.charAt(i) == 'a'){// word.chartAt(i) checks every single characters if it is equal 'a'.
                count++;//count++ counts the 'a' letter how many times used in the string.
            }

        }
        System.out.println("'A' letter is used: " + count + " times.");




    }
}
