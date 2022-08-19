package day24_array.homework;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        /*
        Given a String array:

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
                };

Find and print all the first and last characters
Find and print all the middle character
Print each country as a char array
         */
        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
        };

        for(String word : countries){
            System.out.println("--------------------------------------------------------------");
            // Find and print all the first and last characters
            System.out.println("" + word.charAt(0) + word.charAt(word.length()-1));

            //Find and print all the middle character
            if(word.length() % 2 == 0){// Cuba

                System.out.println(""+ word.charAt(word.length()/2-1) + word.charAt(word.length()/2));//  I divided the // ex:Cuba word.length()/2-1 = 4/2-1=1st-u and word.length/2 = 4/2=2nd-b;
            }else{
                System.out.println(word.charAt(word.length()/2));// ex China word.length/2= 5/2= 2.5-->3rd-i character
            }

            //Print each country as a char array
            System.out.println(Arrays.toString(word.toCharArray()));

        }


    }
}
