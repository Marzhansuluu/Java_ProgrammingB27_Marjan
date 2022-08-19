package day18_loops;

public class DoWhile {
    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println("hello " + i);
            i++;// our i =1 initially, we need to put i++ because 'i' needs to get checked until i = 3.
        }while(i <= 3);
    }
}
