package Practice.Loop;

public class ReverseMiddle2 {
    public static void main(String[] args) {
        /*
        input: "I love java";
        output: "I evol java";
         */

        String s ="I love java";
        //int end = s.indexOf(" ");

        String reverse = s.substring(s.indexOf(' '), s.lastIndexOf(' '));

        System.out.println(reverse);
        for(int i = reverse.length()-1; i >=0;  i--){
            reverse += " " + reverse.charAt(i);
        }
        System.out.println(reverse);
    }
}
