package day28_methods;

import my_utils.StringUtil;

public class VoidVsReturn {
    public static void main(String[] args){
        sayHello();
        sayBye();// the return valusewas not used, so we don't see any difference
        // charAt(0);
        System.out.println(sayBye());// methods return String, I am print a String
        String str = sayBye(); // method returns String and assigned the result into the new variable


       String a = StringUtil.reverse("java");//line 16 and 14-15, we can get the same output. Output in two different ways.
        System.out.println(a);
        System.out.println(StringUtil.reverse("java"));

    }
    public static void sayHello(){
        System.out.println("Hello");
    }

    public static String sayBye(){
        return "Bye";
    }


}
