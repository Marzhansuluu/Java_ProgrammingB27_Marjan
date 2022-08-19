package day16_String.Homework;

public class middleChar {
    public static void main(String[] args) {
        /*
        Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.
    b) If the length of the string is odd there will be one middle character.

    Input:
        elephant
    Output:
        The middle characters: ph
         */
        String sms = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {\"I love programming and problem solving\"}";

        String actualSender = sms.substring(sms.indexOf('<') +1, sms.indexOf('>'));
        String actualNumber = sms.substring(sms.indexOf('[')+1, sms.indexOf(']'));
        String actualMessage = sms.substring(sms.indexOf('{')+1, sms.indexOf('}'));

        System.out.println("Sender: " + actualSender);
        System.out.println("Number: " + actualNumber);
        System.out.println("Message: " + actualMessage);


    }
}
