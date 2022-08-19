package day18_loops;

public class DifferenceBtwDoWhileAndWhile {
    public static void main(String[] args) {
        int i = 100;// i <5 is false
        while(i < 5){// our i < 5 is false which means our code never gets executed.
            System.out.println("hello " + i);
            i++;
        }

        do{
            System.out.println("hello " + i);
            i++;
        }while(i <= 5);// this condition is false thats why it will execute, but since we use do, it will execute only once.

    }
}
