package day15_String.homework;

import java.util.Locale;
import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        /*
        create a class Title
ask the user to enter their name including titles
use the following titles to determine how to refer to the person
handle case sensitivity. User could enter a title as ms, or MS, or Ms. All
should result in a valid result
titles:
Mr or Mister
Ms or Miss or Madam
Dr
and some titles can come after a name:
Sr
Jr
Based on both starting and ending titles print the following messages:
Mr or Mister: Hello Sir
Ms or Miss or Madam: Hello Ma'am
Dr: Hello Doctor
Sr: Nice to meet you Senior
Jr: Nice to meet you Junior
Note: It is possible to have both beginning and ending titles, one of
them, or none of them
         */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your a full name including titles:");
        String fullName = s.nextLine();


            boolean validStart1 = fullName.startsWith("Mr") || fullName.startsWith("Mister");
            boolean validStart2 = fullName.startsWith("Ms") || fullName.startsWith( "Miss") || fullName.startsWith("Madam");

            boolean validStart3 = fullName.startsWith("Dr");
            boolean validEnd1 = fullName.endsWith("Sr");
            boolean validEnd2 = fullName.endsWith("Jr");

            if(validStart1) {
                System.out.println(fullName + " Hello Mr");
            }else if(validStart2){
                System.out.println(fullName + " Hello Ma'am");
            }else if(validStart3){
                System.out.println(fullName + " Hello Dr");
            }
            if (validEnd1){
                System.out.println("Nice to meet you Senior" + fullName);
            }else if(validEnd2){
                System.out.println("Nice to meet you Junior" + fullName);
            }
    }
}
