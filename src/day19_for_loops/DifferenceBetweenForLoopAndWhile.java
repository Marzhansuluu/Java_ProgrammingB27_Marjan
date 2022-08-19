package day19_for_loops;

public class DifferenceBetweenForLoopAndWhile {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5){// in here our condition is true
            i++;
        }

        for(int a = 1; a <= 5; a++){// we also declare the 'a' variable inside the for loop. in here our condition is true. in here since we declare a inside the forLoop when we try to use this 'a' outside the forLoop curly bracket, it will not work. In order to use 'a' we need to do like this

            int b = 1;
            for( ; b <= 5; b++){
                System.out.println("hello " + b);// or we can also use like this
            }
            System.out.println("hello " + b);

            int c;
            for(c = 1; c <= 5; c++){
                System.out.println("hello " + c);
            }
            System.out.println("hello " + c);

        }
    }
}
