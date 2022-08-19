package Practice;

public class CharAtMethod {
    public static void main(String[] args) {
        String s = "Hello";// 01234 index number
        s.charAt(4);// zero is here our index number ="H". If we put it this way we cannot reuse the char.
        System.out.println(s.charAt(4));// we cannot reuse the char

        char ch = s.charAt(3); //in this case we can recall this char

        System.out.println(ch);
        // every letter has index number starts with zero.

    }
}
