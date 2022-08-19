package day19_for_loops;

public class Loop_with_String {
    public static void main(String[] args) {
        String s = "july";
        System.out.println(s.charAt(0));// if i want to print all the character in the string
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));

        for(int i  = 0; i < s.length(); i++){//
            System.out.println(s.charAt(i));// it will print all the index number
        }

    }
}
