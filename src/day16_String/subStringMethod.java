package day16_String;

public class subStringMethod {
    public static void main(String[] args) {
        String s = "infinity";
        System.out.println(s.substring(0));// you will get whole string characters
        System.out.println(s.substring(3));// i will get inity
        System.out.println(s.substring(5));// i will gte ity
        System.out.println(s.substring(7));// i will get y
        //System.out.println(s.substring(9)); index 9 is invalid so stops the program


        System.out.println(s.substring(1,6));// I will get result from until 6 but 6 is not included. I will get nfini

        System.out.println(s.substring(0,1));// s.chartAt(0)
        System.out.println(s.substring(0,1));//i
        System.out.println(s.substring(3,7));//init
        System.out.println(s.substring(3,8));// inity

    }
}
