package Practice.StringEx;

import java.util.Scanner;

public class StringEx2 {
    public static void main(String[] args) {
        /*
        declare a String for the website and check tif it is valid website should start with "www."
        website should end with one of the following:
        .com
        .edu
        .gov
        .net
        valid website or invalid website
        bonus; why the website is invalid
         */
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a website");
        String website = input.nextLine();

        boolean starts= website.startsWith("www.");
        boolean ends = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net");

        if(starts && ends ){
            System.out.println("Valid website");
        }else{
            System.out.println("invalid website");
            if(!starts){
                System.out.println("website should start with www.");
            }
            if(!ends){
                System.out.println("website should end with .gov or .edu or .net or .edu");
            }
        }
    }
}
