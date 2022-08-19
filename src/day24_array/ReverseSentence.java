package day24_array;

public class ReverseSentence {
    public static void main(String[] args) {

        String str = "Today is Friday. Have a good weekend!";
        // reverse: weekend! good a Have Friday. is Today

        String [] words = str.split(" ");
        String reverse = "";

        for(int i = words.length-1; i >= 0 ; i--){// iterating through a number of backwards, starting last index to 0.
            reverse += words[i] + " ";
        }
        System.out.println(reverse.trim());

        System.out.println("--------------------------------------------------------");





    }
}
