package day14_string.Homework;

public class Password {
    public static void main(String[] args) {
        /*
        Declare and assign a String for password
the password should be more than 8 character long
print: Valid password or Invalid password
         */
        String password ="mrj1234@*b";
        System.out.println(password.length());
        System.out.println(password.equals("mrj1234@*b"));
        System.out.println(password.equals("Mrj1234@*B"));
        System.out.println(password.equalsIgnoreCase("Mrj1234@*B"));
    }
}
