package day14_string;
/*
Declare and assign a String for password
the password should be more than 8 character long
print: Valid password or Invalid password
 */
public class PasswordEquals {
    public static void main(String[] args) {
        String password = "MkMk12@dfg";
        System.out.println(password);// original value
        System.out.println(password.equals("MkMk12@dfg"));// true
        password = password.toLowerCase();
        System.out.println(password.equals("mkmk12@dfg"));// false because this password is written in lower case
        System.out.println(password.equalsIgnoreCase("MKMK12@dfg"));//true
    }
}
