package day14_string;

public class TrimLengthMethod {
    public static void main(String[] args) {
        String s = "       java        ";
        System.out.println(s);
        System.out.println(s.length());// this length will be 19. because every spaces are matter for length method.
        s = s.trim();// trim() method gets rid of all the extra spaces in the beginning end of the a String
        System.out.println(s);
        System.out.println(s.length());// it will print 4 because we use the trim to get rid of the spaces.

        String s2= "   multiple words here     ";
        System.out.println(s2);
        System.out.println(s2.length());// in here the s2 has 27 characters.
        System.out.println(s2.trim());// trim will remove from beginning and end, middle spaces will not be touched.
        s2 = s2.trim();
        System.out.println(s2.length());// now length method will print 19 because we have total of 19 characters.
    }
}
