package day17_loops;

public class smsSubstringIndexOfMethod {
    public static void main(String[] args) {
/*
Given a String in the following format:
Sender: <James Bond>. From Number: [202-123-3456]. + Message: {"I love programming and problem solving"}

Separate these parts and print them separately:
    Sender: actualSender
    Number: actualNumber
    Message: actualMessage

 */
        String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {\"I love programming and problem solving\"}";

        int startSender = msg.indexOf('<')+1;
        int endSender = msg.indexOf('>');
        int startNumber = msg.indexOf('[')+1;
        int endNumber = msg.indexOf(']');
        int startMsg = msg.indexOf('{');
        int endMsg = msg.indexOf('}');

        String sender = msg.substring(startSender, endSender);
        String number = msg.substring(startNumber, endNumber);
        String message = msg.substring(startMsg + 1, endMsg);

        System.out.println("sender = " + sender);
        System.out.println("number = " + number);
        System.out.println("message = " + message);
    }
}
