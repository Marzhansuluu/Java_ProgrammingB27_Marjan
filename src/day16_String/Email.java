package day16_String;

public class Email {
    public static void main(String[] args) {
        /*
        saim@cydeo.com
        name : saim
        domain : cydeo
         */
        String email = "saim@cydeo.com";
        int indexOfAt = email.indexOf('@');
        String name = email.substring(0, indexOfAt);

        int indexOfDot = email.indexOf('.');
        String domain = email.substring(indexOfAt + 1 , indexOfDot);// it will print until the dot.


        System.out.println("Email: " + email);
        System.out.println("Name: " + name);
        System.out.println("Domain: " + domain);



    }
}
