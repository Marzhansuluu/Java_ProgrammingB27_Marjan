package day14_string;
/*
String sentence = "hello My NAME is";
        System.out.println(sentence);// original one
       System.out.println("printing the sentence value with lower case: " + sentence.toLowerCase());// all in lower case
       System.out.println(sentence); // i will see original string, the string is immutable it cannot change.
       String lowerVer = sentence.toLowerCase();// we just created a new variable.we did not print.
        String abc = sentence.toUpperCase();
        System.out.println("abc value upper case: " + abc);
       System.out.println(lowerVer);// it will print all in lower case we declare the new variable/object it is just printing the value for this variable/object.
        System.out.println(sentence);//this will print the original sentence
        //option 3;
        sentence = sentence.toLowerCase();// reassign the value then we lose the first string value.
        System.out.println("after replacing the value " + sentence);
 */
public class LowerCase {
    public static void main(String[] args) {
        String s = "HELLO";
        System.out.println(s);// original upper case HELLO
        System.out.println(s.toLowerCase());// hello
        s.toLowerCase(); // I changed the value to lower case
        System.out.println(s); // i will get the original

        String s1 = s.toLowerCase(); // I will not lose the original value
        s1 = s1.toUpperCase();
        //System.out.println(s);
        System.out.println(s1);

    }
}
