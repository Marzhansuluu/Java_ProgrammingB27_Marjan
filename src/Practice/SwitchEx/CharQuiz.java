package Practice.SwitchEx;

public class CharQuiz {
    public static void main(String[] args) {

        System.out.println("Select the primitive datatype\na)String\nb)int\nc)main");
        char option = 'c';

        switch (option){
            case 'a':
            case 'c':
                System.out.println("incorrect");
                break;
            case 'b':
                System.out.println("correct");
        }
    }
}
