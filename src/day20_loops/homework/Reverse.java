package day20_loops.homework;

public class Reverse {
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
        String result= "";
        String middleWord = str.substring(str.indexOf(' ')+1, str.lastIndexOf(' '));
        for(int i = middleWord.length()-1; i >= 0; i--){// we want 'i' start  from middle word. when we do i-- basically it will start backward, which at the beginning our i=3. why we use the middleWord.length()-1 because our index number starts from zero that's why we did -1. since we are doing only the middle word it starts with 0.and our 'i' has to be equal to 0 too in order to print the index number 0.
        result += middleWord.charAt(i);// we put i because i=3 which is e, i=2-->v, i=1-->o, i=0-->l
        }
        System.out.println(result);
        System.out.println(str.replace(middleWord, result));
        System.out.println(str.substring(0, str.indexOf(' ')+1) + result + str.substring(str.lastIndexOf(' '), str.length()));
    }
}
