package day10_if_else_elseIf_statements.homework;

import java.util.Scanner;

public class Language {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose number between 1- 5");
        int language = scan.nextInt();
        String answer = "";

        if(language == 1){
            answer="1: Hello, thank for your call";
        }else if(language ==2 ){
            answer = "2: Hola, gracias para llamar";
        }else if(language ==3) {
            answer = "3: Merhaba, aradiginiz icin tesekkurler";
        }else if(language == 4) {
            answer = "4: Privet, spasibo za vash zvonok";
        }else if(language == 5){
            answer = "5: Merci ,pour votre appel";
        }else{
            answer="We will use English by default";
        }
        System.out.println(answer);


        /*create a class ChooseLanguage
ask the user to enter a number based on the language they wanted to use.
        1 - English
        2 - Spanish
        3 - Turkish
        4 - Russian
        5 - French
        based on the number they picked print a message:
        1 : "hello, thank for your call"
        2 : "hola, gracias para llamar"
        3 : "merhaba, aradiginiz icin tesekkurler"
        4 : "privet, spasibo za vash zvonok"
        5 : "Merci ,pour votre appel"
        any other number: "We will use English by default"
        Extra: add your own options

         */
    }
}
