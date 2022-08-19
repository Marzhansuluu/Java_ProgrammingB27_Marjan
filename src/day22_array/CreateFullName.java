package day22_array;

public class CreateFullName {
    /*
    Create a String array that has full names. Go through manually and print the initials of each name. Get each name(element) and use the String methods needed

    Ex: ["James Bonds", "Harry Potter", "Tony Stark"]

        JB
        HP
        TS

No loop yet
     */
    public static void main(String[] args) {
        String[] fullName = {"James Bonds", "Harry Potter", "Tony Stark"};
        System.out.println("James Bond:     " + fullName[0].charAt(0) + fullName[0].charAt(fullName[0].indexOf(" ") + 1));
        System.out.println("Harry Potter:   " + fullName[1].charAt(0) + fullName[1].charAt(fullName[1].indexOf(" ") + 1));
        System.out.println("Tony Stark:     " + fullName[2].charAt(0) + fullName[2].charAt(fullName[2].indexOf(" ") + 1));
    }
}
