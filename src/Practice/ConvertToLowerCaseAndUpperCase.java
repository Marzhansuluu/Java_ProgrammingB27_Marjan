package Practice;

public class ConvertToLowerCaseAndUpperCase {
    public static void main(String[] args) {
        String s = "HELLO";
        s.toLowerCase();
        System.out.println(s);// HELLO
        s = s.toLowerCase();
        System.out.println(s);// hello

        String s2 = "hello";
        s2.toUpperCase();
        System.out.println(s2);// we will receive "hello"

       s2=s2.toUpperCase();
        System.out.println(s2);// we will get Upper case HELLO.
    }
}
