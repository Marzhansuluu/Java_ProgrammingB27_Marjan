package day16_String;

import java.util.Locale;

public class Titles {
    public static void main(String[] args) {
        String name = "Mr James";
        name = name.toLowerCase();
        if(name.startsWith("mr") || name.startsWith("mister")){
            System.out.println("Hello Sir");
        }else if(name.startsWith("ms") || name.startsWith("miss") || name.startsWith("madam")){
            System.out.println("Hello Ma'am");
        }else if(name.startsWith("dr")){
            System.out.println("Hello Doctor");
        }
        if(name.endsWith("sr")){
            System.out.println("Nice to meet you Senior");
        }else if(name.endsWith("jr")){
            System.out.println("Nice to meet you Junior");
        }
    }
}
