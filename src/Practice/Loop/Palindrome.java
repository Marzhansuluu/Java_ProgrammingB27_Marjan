package Practice.Loop;

public class Palindrome {
    /*
    Given a String if it is palindrome. Palindrome means String is read the same forward and backwards
    ex:
    anna racecar
     */
    public static void main(String[] args) {
        String s = "racecar";
        String palindrome = "";
        String reverse ="";


        for(int j =s.length()-1; j >= 0; j--){
            reverse += s.charAt(j);
        }
        if(s.equalsIgnoreCase(reverse)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }

    }
}
