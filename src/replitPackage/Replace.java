package replitPackage;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        //WRITE YOUR CODE HERE

        String sentence = "You are so dumb";
        sentence = sentence.replace("dumb", "cool");
        System.out.println(sentence);
    }
}
