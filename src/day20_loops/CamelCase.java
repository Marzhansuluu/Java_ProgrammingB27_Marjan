package day20_loops;

import java.util.Scanner;

public class CamelCase {
    /*
    Camel Case

Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

Ex:

	Today is SUNDAY

	Output:

	todayIsSunday
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter multiple words");
        String str = scan.nextLine().toLowerCase();
        String camelCase = "";

        for(int i = 0; i <str.length(); i++){
            if(str.charAt(i) == ' '){// in here we are checking index 0(i=0), do we have space,if we do not have the String value is storing at the else result, then index 2. when there is a space character it will do some action  add the next character as upper case as the start of the next word.

                camelCase += str.substring(i+1, i+2).toUpperCase();// gives the one character after the space// burda biz today kelimesinden sonraki space geldik, ondan sonra character'e gectik cunku ordaki space'i yok etmek icin.
                //str.charAt(i +1); // if we want to charAt method then wee need to use this one
                i++;// we need to continue from where we stop for 'i' value.
            }else{
                camelCase += str.charAt(i);
            }
        }
        System.out.println(camelCase);
    }
}
