package Practice;

import java.sql.SQLOutput;

public class StringExample {
    public static void main(String[] args) {

        String s= "first";// string literal / string pool
        String s01 = "first";
        String s02 = "first";
        String s03 = new String("first");
        System.out.println(s== s03);


        String s2= new String("second"); // new keyword/ heap first and second are different objects


        System.out.println(s2 == s); // false


        String s3 = new String("first");// new keyword/ heap
        System.out.println(s3 == s); // false

        String s4 = "second";
        System.out.println( s == s4); //false

        String s5= "first";
        System.out.println(s == s5);// true

    }
}
