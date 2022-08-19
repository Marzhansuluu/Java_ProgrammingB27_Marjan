package Practice.Loop;

public class CountCharacters {
    public static void main(String[] args) {
        /*
        Given a String, find and print how many uppercase letter, lowercase
        letter, and number are in the String.
        Ex:
        Input:
                2juMp41EEkd4s4
        Output:
                3 uppercase letters
                6 lowercase letters
                5 numbers
         */
        String s = "2juMp41EEkd4s4";
        int upperCase =0;
        int lowerCase =0;
        int num =0;

        for(int i =0; i < s.length(); i++){
            char eachLetter =s.charAt(i);
            if(eachLetter >= 'A' && eachLetter <= 'Z' ){
                upperCase ++;

            }else if(eachLetter >= '1' && eachLetter <='9'){
                num++;
            }else if(eachLetter >= 'a' && eachLetter <= 'z'){
                lowerCase++;
            }
        }
        System.out.println("upperCase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("num = " + num);
    }
}
