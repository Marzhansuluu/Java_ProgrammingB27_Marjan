package Practice.Loop;

public class ReverseMiddle {
    public static void main(String[] args) {
        String s ="I love java";
        int start = s.indexOf(' ')+1;
        int end = s.lastIndexOf(' ');

        String middleWord = s.substring(start, end);
        String reverse ="";

        for(int i =middleWord.length()-1; i >= 0; i--){
            reverse += middleWord.charAt(i);

        }
        System.out.println(s.substring(0, s.indexOf(' '))+ " " + reverse + " " + s.substring(end +1));
    }
}
