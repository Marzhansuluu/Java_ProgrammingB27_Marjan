package day13_switch_string;

public class StringObject {
    public static void main(String[] args) {
        String s = "first"; // String literal, in String pool
        String s2 = new String("second"); // object in the heap
        System.out.println(s == s2);// comparing two different objects "FALSE"
        String s3 = new String("first"); // object in the heap.
        System.out.println(s == s3); //comparing two different objects "FALSE"
        String s4= "second"; //string literal, in string pool
        System.out.println(s == s4); // these are in the same pool but not equal "FALSE"

        String s5= "first";// string literal, in string pool
        System.out.println(s == s5);// these are in the same pool and same value. "TRUE"

    }
}
