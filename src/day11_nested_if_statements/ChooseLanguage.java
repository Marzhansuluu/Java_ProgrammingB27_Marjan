package day11_nested_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number from 1-5 to select your language\n\t1)English \n\t2)Spanish\n\t3)Turkish\n\t4)Russian\n\t5)French");
        int languageOption = scan.nextInt();
        String result = "";

        if(languageOption == 1){
            result = "Hello, thank you for your call";
        }else if(languageOption == 2){
            result = "Hola, gracias para llamar";
        }else if(languageOption == 3){
            result = "Merhaba, aradiginiz icin tesekkurler";
        } else if (languageOption ==4) {
            result = "privet, spasibo za vash zvanok";
        }else if(languageOption ==5){
            result ="Merci, pour votre appel";
        }else{
            result = "We will use English by default";
        }
        System.out.println(result);

    }
}
