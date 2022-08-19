package day20_loops;

public class ReverseMiddle {
    public static void main(String[] args) {
        /*
        Reverse only second word

Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	I love java

	Ouput:
	I evol java

         */

        String str = "I love java";
        int start = str.indexOf(' ') + 1;// this will give the first character of the middle word
        int end = str.lastIndexOf(' ');
        String middleWord = str.substring(start, end);

        String reverseMiddle = "";
        for( int i = middleWord.length() - 1; i >= 0 ; i--){// loop starts from the last index of the middle word and foes until the first index int a backward order

            reverseMiddle += middleWord.charAt(i); // reading each character based on the in t i value, which is going backwards and then  concatenation that character tk tbe reverseMiddle String
        }
        System.out.println(str.substring(0, str.indexOf(' ')) + " " +reverseMiddle + " " + str.substring(end, + 1));
        // str.substring(0, str.indexOf(' ') gives the first word
        // str.substring(0, str.indexOf(' ') could have been written as: str.substring(0, start - 1)
        //str.substring(end +1) could have been written as: str.substring(str.lastIndexOf(' ') + 1)
        // str.replace(middleWord, reverseWord) another option instead of line 26.


        /*
        String str = "i love java";
        String reverse = "";
        for(int i = str.lastIndex(' ') - 1; i > str.indexOf(' '); i --){
        reverse += str.charAt(i);
        }
         */

    }
}
