package Practice.StringEx;

public class LongestA {
    public static void main(String[] args) {
        /*
        create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word
that also contains 'a'
Ex:
"java"
"mouse"
"computer"
Output: java
Challenge: Instead of just checking for "a" add another variable that can
be used to check for any character.
         */
        String w1="java";
        String w2 = "mouse";
        String w3= "computer";


        int w1l= w1.length();
        int w2l= w2.length();
        int w3l=w3.length();
        String longest="";

        if(w1.contains("a") && w1l > longest.length()){
            longest = w1;
        }else if(w2.contains("a") && w2l > longest.length()){
            longest = w2;
        }else if(w3.contains("a") && w3l > longest.length()){
            longest =w3;
        }
        System.out.println(longest);
    }
}
