package Practice;

public class SubstringMethod {
    public static void main(String[] args) {
        String s = "I love Java language!";
        String result1 = s.substring(s.indexOf("J"));// it will print for me starting from 'J' and the rest
        System.out.println("result1 = " + result1);

        String result2 = s.substring(7 ,20);// I use in here the substring int number to print, in order to find the index numbers I need to count the characters one by one, not to count the letters I can use indexOf or lastIndexOf methods. And this code will print for me, between 7 - 20
        System.out.println("result2 = " + result2); //

        String result3 = s.substring(s.indexOf("J") , s.lastIndexOf("!"));// in here I use indexOf and lastIndexOf method, in that way i do not need to count how mnay index number I lova java language has. and this also prints between 'J' and '!'. Pretty much similar with the code above.
        System.out.println("result3 = " + result3);
    }
}
