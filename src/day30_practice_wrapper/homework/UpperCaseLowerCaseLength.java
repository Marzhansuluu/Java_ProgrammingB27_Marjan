package day30_practice_wrapper.homework;

public class UpperCaseLowerCaseLength {
    /*
    Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string

Ex:
    str = "JAVA java";

output:

    true
     */
    public static void main(String[] args) {
        String str = "JAVA java";
        System.out.println(isUpperAndLowerCaseAreEqual(str));
    }
    public static boolean isUpperAndLowerCaseAreEqual(String str){
        int upperCase = 0;
        int lowerCase = 0;

        for(int i =0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))){
                lowerCase++;
            }
            if(Character.isUpperCase(str.charAt(i))){
                upperCase++;
            }

        }
        return upperCase == lowerCase;
    }
}
