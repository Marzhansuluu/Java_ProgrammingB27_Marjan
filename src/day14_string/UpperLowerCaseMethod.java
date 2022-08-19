package day14_string;

public class UpperLowerCaseMethod {
    public static void main(String[] args) {


        String word = "Summer";
        word.toUpperCase();
        System.out.println(word);// it is not gonna print me Summer with upperCase.Because the string is immutable/unchangeable. In order to print Summer with UpperCase I need to replace it word = word.toUpperCase(); But we will lose the first Summer/ value. Basically we will replace the value with SUMMER. These are two different object. Summer and SUMMER.

        word = word.toUpperCase();//this time we make all the characters uppercase, then the String it gives us back all uppercase was reassigned into the value.
        System.out.println(word);

        System.out.println("======================================================");

        String sentence = "hello My NAME is";
        System.out.println(sentence);// original one
        System.out.println(sentence.toLowerCase());// all in lower case
        System.out.println(sentence); // i will see original string, the string is immutable it cannot change.
        String lowerVer = sentence.toLowerCase();// we just created a new variable.we did not print.
        System.out.println(lowerVer);// it will print all in lower case we declare the new variable/object it is just printing the value for this variable/object.
        System.out.println(sentence);//this will print the original sentence
        //option 3;
        //sentence = sentence.toLowerCase);// reassign the value then we lose the first string value.



    }
}
