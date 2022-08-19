package Practice;

public class TrimMethodString {
    public static void main(String[] args) {
        String s = "      Java    Programming Language     ";
        System.out.println(s);

        s.trim();
        System.out.println(s);

        s = s.trim();
        System.out.println(s);
    }
}
