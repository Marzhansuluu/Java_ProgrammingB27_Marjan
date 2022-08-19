package day16_String;

import java.util.Scanner;

public class smsWithScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //String s = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {\"I love programming and problem solving\"} fnkjfehkjheeG";
//                                  '<' is included ,    '>' is exluded .
        String sender = s.substring(s.indexOf('<') +1 , s.indexOf('>') );
        String number = s.substring(s.indexOf('[') + 1 , s.indexOf(']') );
        String message = s.substring(s.indexOf('{') +1 , s.indexOf('}'));
        String random =  s.substring(s.indexOf('}') , s.lastIndexOf('G')+1);

        System.out.println("sender: = " + sender);
        System.out.println("number: = " + number);
        System.out.println("message: = " + message);
        System.out.println("random = " + random);
    }
}
