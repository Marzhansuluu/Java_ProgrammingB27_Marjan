package Practice.StringEx;

public class StringMethod1 {
    public static void main(String[] args) {
        String username = "jamesbond";
        String password = "BOND007";
        System.out.println(username.equals("jamesbond"));//true
        System.out.println(password.equalsIgnoreCase("bond007"));//false
        System.out.println(username.equalsIgnoreCase("JAMESBOND"));// ture

    }
}
