package day14_string.Homework;

public class UpperAndLowerCasePractice {
    public static void main(String[] args) {
        /*
        Declare and assign a String
print the String in all uppercase format and
print the String in all lowercase format
         */
        String s1 = "HELLO WORLD";
        s1.toLowerCase();
        System.out.println(s1);// it will give us the original value
        System.out.println(s1.toLowerCase());// it will give changed value but our original value is still there.
        System.out.println(s1);// it will still give me the original value
        s1 = s1.toLowerCase();
        System.out.println(s1);// we will lose the original value.

    }
}
