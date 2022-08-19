package day17_loops;

public class moreMethods {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s.isEmpty());// false

        String s2 = " ";// space char
        System.out.println(s2.isEmpty());//false

        String s3 = "";// empty space, string but no characters
        System.out.println(s3.isEmpty());// true because there is no character

        String a = "    ";
        System.out.println(a.isEmpty());// checks if there is character // false because it is not empty it has empty spaces
        System.out.println(a.isBlank());// checks for non space characters // true because it is blank there is no characters and blabk ignores the spaces.

        String b = "h";
        System.out.println(b.isEmpty());// false because it is not empty
        System.out.println(b.isBlank());// false because it is not blank

        String c = "";
        System.out.println(c.isBlank());
        System.out.println(c.isEmpty());
        System.out.println("============================================================");

        //REPLACE
        String str = "java";
        str = str.replace('j', 'J');// now my new value for the str is "Java"
        System.out.println(str);

        str = str.replace("Java", "JAVA");// since my current value is "Java" I am relacing it with "JAVA"
        System.out.println(str);

        String str2 = "an apple path";
        System.out.println(str2.replace("a", "(a)"));// it will replace the all the "a" letters

        String str3 = "    multiple words here    ";// I have multiple spaces
        //str3 = str3.trim();// I assign the trim method
        //System.out.println(str);
        System.out.println(str3.trim());// it will trim only once

        str3 = str3.replace(" ", "");// in here it will erase all the spaces including spaces between words.
        System.out.println(str3);

        String z = "wooden spoon";
        System.out.println(z.replace("o", "-"));// it will replace the all the "o" to "-".
        System.out.println(z.replaceFirst("o", "-"));// it will replace the first "o" into "-".

        // how to replace middle character only
        String ex = "wooden spoon";
        int firstO = ex.indexOf('o');
        int secondO = ex.indexOf('o', firstO + 1);
        System.out.println(ex.substring(0, secondO));
        System.out.println(ex.substring(secondO).replaceFirst("o", "-"));
        System.out.println(ex.substring(0, secondO) + ex.substring(secondO).replaceFirst("o", "-"));




    }
}
