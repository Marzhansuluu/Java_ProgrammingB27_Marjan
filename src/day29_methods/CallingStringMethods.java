package day29_methods;

import my_utils.StringUtil;
import org.w3c.dom.ls.LSOutput;

public class CallingStringMethods {
    public static void main(String[] args) {
        System.out.println(StringUtil.reverse("Hello world"));

        System.out.println(StringUtil.isPalindrome("racecar"));


        System.out.println(StringUtil.fixFormat("jameS"));

        System.out.println(StringUtil.camelCase("JAVA will ruLE tHe wORld"));

    }



}
