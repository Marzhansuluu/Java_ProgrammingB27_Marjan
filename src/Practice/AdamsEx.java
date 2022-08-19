package Practice;

public class AdamsEx {
    public static void main(String[] args) {
        String str= "Cybertek";
        char first = str.charAt(0);// to get the 1 character
        char second = str.charAt(1);// to get the second character
        char lastCharacter = str.charAt(str.length()-1);
        char lastCharacter2 = str.charAt(str.lastIndexOf("e")+1);



        for(int i =0; i <= str.length()-1; i++){
            char ch = str.charAt(i);
            System.out.println(i + 1 + " . ch = " + ch);// yani burda char ch hangi karaktere geldiyse onuda print yapiyrouz.
        }

    }
}
