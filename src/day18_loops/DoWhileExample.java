package day18_loops;

public class DoWhileExample {
    public static void main(String[] args) {
        int i =0;
        do{
            System.out.println(i);
        }while(false);
        // the do block is execute first, then boolean is checked if it is false it will stop
        do{
            System.out.print(i + ", ");
            i++;
        }while(i <= 10);
       //i++; if we put i++ in here we will crash the code

    }
}
