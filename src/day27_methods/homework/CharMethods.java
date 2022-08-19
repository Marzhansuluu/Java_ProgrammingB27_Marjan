package day27_methods.homework;

public class CharMethods {
    /*
    Character Methods
    Print each one in one line
    - make method that will print all the letters from A to Z
    - make method that will print all the letters from a to z
    - make method that will print all the letters from Z to A
    - make method that will print all the letters from z to a
    - make method that will print all the letters from 0 to 9
     */
        public static void letterUpperAZ(char start, char end){// char start, char end==parameter

            for(char i =start; i <= end;  i++){
                System.out.print(i +" ");
            }

        }
        public static void letterLowerAZ(){
            for(char i = 'a'; i <= 'z'; i++){
                System.out.print(i + " ");
            }
        }

        public static void reverseUpperAZ(){
            for(char i = 'Z'; i >= 'A'; i--){
                System.out.print(i + " ");
            }
        }

        public static void reverseLowerAZ(){
            for(char i = 'z'; i >= 'a'; i--){
                System.out.print(i + " ");
            }
        }

    public static void number(){
        for(int i = 0; i <= 9; i++){
            System.out.print(i + " ");
        }
    }
    public static void space(){
        System.out.println();
    }

    public static void main(String[] args) {
        letterUpperAZ('A', 'Z');// 'A', 'Z' == argument
        space();
        letterLowerAZ();
        space();
        reverseLowerAZ();
        space();
        reverseUpperAZ();
        space();
        number();
    }

}
