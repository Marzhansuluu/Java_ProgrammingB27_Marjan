package day12_switch;

public class NumberToWord {
    public static void main(String[] args) {
        /*
        number from 1-5
        convert the number to number word
        1===> one
        2===> two
        default case
         */
        int number = 3;
        switch (number){
            default:
                System.out.println("Put the number between 1-5");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
        }
    }
}
