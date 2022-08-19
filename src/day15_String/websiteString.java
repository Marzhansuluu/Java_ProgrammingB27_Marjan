package day15_String;

import java.util.Scanner;

public class websiteString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your website");
        String website = s.next();
        boolean validStart = website.startsWith("www.");
        boolean validEnd = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net");

        if(validStart && validEnd){
            System.out.println(website + " is valid");
        }else {
            System.out.println(website + " is invalid");
        }
        if(!validStart){
            System.out.println("Website should start with www.");
        }
        if(!validEnd){
            System.out.println("Website should end with .com or .edu or .gov or .net");
        }


    }
}
