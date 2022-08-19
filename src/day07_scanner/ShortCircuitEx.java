package day07_scanner;

public class ShortCircuitEx {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(false && true);
        //System.out.println(5/0); //you can not divide by 0.
       // System.out.println(true || count++ ==1); // the code does not run because OR one true enough
       // System.out.println(false | count++ ==1); //it won't run because this is not correct
        //System.out.println(count);
    }
}
