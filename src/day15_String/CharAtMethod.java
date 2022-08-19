package day15_String;

public class CharAtMethod {
    public static void main(String[] args) {
        String s = "java";
        //          0123
        System.out.println("First character in my string is: " + s.charAt(0));
        System.out.println("Second character in my string is: " + s.charAt(1));
        System.out.println("Third character in my string is: " + s.charAt(2));
        System.out.println("Fourth character in my string is: " + s.charAt(3));// s.charAt(s.length() - 1)
        //System.out.println("Fifth character in my string is: " + s.charAt(4)); 4 is not valid index in our String
        System.out.println("length: " + s.length());
        System.out.println("last index: " + 3);// 3 is here our index number
        // reverse my String to hardcoded: goal is to see: avaj
        System.out.print(s.charAt(3));// i printed java reverse, with hardcode way.
        System.out.print(s.charAt(2));
        System.out.print(s.charAt(1));
        System.out.print(s.charAt(0));
        System.out.println();

        System.out.println(s.charAt(3) + s.charAt(2) + s.charAt( 1) + s.charAt(0));// this will add the numbers from ascii
        System.out.println("" + s.charAt(3) + s.charAt(2) + s.charAt( 1) + s.charAt(0));


    }
}
