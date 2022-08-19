package Practice.StringEx;

import java.util.Scanner;

public class RelativeChecker {
    public static void main(String[] args) {
        /*
         Given two full names check if the two people are related. They will be considered to be related if they have the same last name

    Input:
        James Bond
        Jamie Bond
    Output:
        Related

    -------------------

    Input:
        James Bond
        Alex Benji
    Output:
        Not Related
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter first person's full name");
        String name1 = scan.nextLine();
        System.out.println("Enter second person's full name");
        String name2 = scan.nextLine();

        int indexOf = name1.indexOf(' ');
        String lastName = name1.substring(indexOf +1);
        if(name2.endsWith(lastName)){
            System.out.println("relatives");
        }else{
            System.out.println("not related");
        }
    }
}
