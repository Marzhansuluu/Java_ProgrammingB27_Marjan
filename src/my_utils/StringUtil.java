package my_utils;

public class StringUtil {
/*
This class will be used to creat String utility methods
 */
    public static String reverse(String str){
        String reverse = "";

        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return  reverse;
    }

    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }



    public static String fixFormat(String str){
        /*
    Fix Format
    create a method will accept a String and return a String in proper format. Proper format is:
    First character starting as uppercase and the rest as lowercase
     */
        return  str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }





    public static String camelCase(String str){
        /*
    Camel Case
    create a method will accept a String, of words separated by spaces, and return a camel case version of the String where the first letter of each word is Uppercase and the rest of the is in lowerCase.
    Exception: First word starts with lowerCase
     */

        String [] allWords = str.split(" ");
        String camelCase = allWords[0].toLowerCase();

        for(int i =1; i < allWords.length; i++){// starting from index 1 because I already used the first word.
            camelCase += fixFormat(allWords[i]);// I am reading each word. allwords[i]- as a argument

        }
        return camelCase;

    }

    public static int frequencyOfChar(String str, char letter){
        /*
    given a String and determine how many times the given char is found in the String
    "java"
    a--> 2;
     */
        int count=0;
        for(int i =0; i< str.length(); i++){
            if(str.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }

}
