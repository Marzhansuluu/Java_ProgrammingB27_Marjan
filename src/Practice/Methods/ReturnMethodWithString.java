package Practice.Methods;

public class ReturnMethodWithString {
    public static String reverse(String word){
        String result = "";

        for(int i = word.length()-1; i >= 0; i--){
            result += word.charAt(i);
        }

        return result;

    }

    public static boolean isPalindrome(String word){

        String reversed = reverse(word);

        return reversed.equalsIgnoreCase(word);

    }

    public static void main(String[] args) {

        String word2 = reverse("anna");

        System.out.println(word2);
        System.out.println("--------------------------------------");

        System.out.println(isPalindrome("java"));// we will get false
        System.out.println(isPalindrome("racecar"));// true

    }



}
