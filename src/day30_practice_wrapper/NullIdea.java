package day30_practice_wrapper;

public class NullIdea {
    public static void main(String[] args) {
        String[] a = {"hello", "world", "friday"};
        System.out.println(a[0]);
        System.out.println(a[0].charAt(0));

        String [] b = new String[2];// [null, null]
        System.out.println(b[0]);// it will print null
        System.out.println(b[0].charAt(0));// it will give an error because there is no value yet.
    }
}
