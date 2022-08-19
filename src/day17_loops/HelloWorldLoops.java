package day17_loops;

public class HelloWorldLoops{
    public static void main(String[] args) {
        System.out.println("Hello World");// I want to print 100 times
        /* while(true){// this is infinite loop

            System.out.println("Hello World");
        }



        this code also infinite loop. because 0 is less 50.
        int counter = 0; // starting from 1 to 50;
        while(counter <50) {
            System.out.println("Hello World " + counter);
        }
        */

         int counter = 1;
         while(counter <= 50){
             System.out.println("Hello World " + counter);
             counter++; // this line adds 1 to the number each iteration, it allows the loop to stop at some point.
         }

    }
}
