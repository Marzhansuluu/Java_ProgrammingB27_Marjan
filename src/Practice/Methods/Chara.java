package Practice.Methods;

public class Chara {
    /*
    make method that will print all the letters from A to Z

     */
    public static void printLetter(){
        for(char i = 'A'; i <= 'Z'; i++){// ascii A lower than Z.i=A,i=B.....i=Z
            System.out.print(i);//A....Z
        }
    }

    public static void main(String[] args) {
        printLetter();
    }
}
