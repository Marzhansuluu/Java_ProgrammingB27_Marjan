package day21_nested_loops;

import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {
        /*
        java given a String find the print all the unique characters unique character: only appears in the String once."java"
        output:
        jv

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;// burda character'i bir sonraki characteri bakmasi icin konuldu
                }

            }

            if(count == 1) { // if the counter is 1 the character was only found 1 time. the character only matched itself. Yani count == 1 sebebi karakter 1 olarak cikarsa yani bu demek oluyor ki bu cjaracter bir kere kulanildi.
                System.out.println(str.charAt(i));
            }
        }





//        for (int i = 0; i < str.length(); i++){
//            System.out.println(str.charAt(i) + " = ");
//
//            for(int j = 0; j < str.length(); j++){
//                //System.out.println(str.charAt(i )+ "-->" + str.charAt(j));
//                System.out.println("-");// we will get 4 dashes it shows that we are iterating 4 times.
//                // we will get like this output; j = -j -a-v-a basically the 'j' is checking j = j, j=a, j=v , j=a...
//            }
//            System.out.println();
//        }
    }
}
