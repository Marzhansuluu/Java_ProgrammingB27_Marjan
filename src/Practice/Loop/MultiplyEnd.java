package Practice.Loop;

public class MultiplyEnd {
    /*
    Multiply End
Given a String and a number return a String that has the ending character
duplicated and attached by the number amount of times
Ex:
Input:
Hello?
3
Output:
Hello????
Ex:
Input:
java
5
Output:
javaaaaaa
     */
    public static void main(String[] args) {
        String str ="hello";
        int end = 3;

        for(int i =0; i < end; i++){
            str += str.charAt(str.length()-1);
        }
        System.out.println(str);
    }
}
