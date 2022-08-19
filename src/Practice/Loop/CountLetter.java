package Practice.Loop;

public class CountLetter {
    public static void main(String[] args) {
        // frequency
        // word --> java
        // how many 'a' chars?
        int count =0;
        String s ="java";

        for(int i= 0; i< s.length(); i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
