package day17_loops;

public class printLetters {
    public static void main(String[] args) {
        char first = 'A';
        while(first <= 'Z') {// A is less than Z, that's why it will print all the alphabet from A to Z.
            System.out.print(first++);// i put in here ++ to go forward

        }
        System.out.println();
        System.out.println("========================================================");
            // printing z -a
            char backwards = 'z';
            while(backwards >= 'a'){
                System.out.print(backwards--);// i used post decrement "--" to go backward, if i will put "++" it will crash.
            }

    }
}
