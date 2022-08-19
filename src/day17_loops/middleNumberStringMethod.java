package day17_loops;

public class middleNumberStringMethod {
    public static void main(String[] args) {
        String s = "elephant";
        //          01234
        //        length 5/2 = 2
        // elevator length 9/2 = 4
        // 12345678
        if(s.length() % 2 == 1){//s has an odd number of characters, so 1 middle char
            int midIndex = s.length() / 2;
            System.out.println("The middle char: " + s.charAt(midIndex));
        }else{
            // s has an even number of characters, so 2 middle char
            //elephant    length 8/2 = 4
            //01234567   index number
            int firstMid = s.length() / 2 -1;
            int secondMid = s.length() / 2;
            System.out.println("The middle char are: " + s.charAt(firstMid) + s.charAt(secondMid));
            System.out.println("The middle char are : " + s.substring(firstMid, secondMid+1));
        }
    }
}
