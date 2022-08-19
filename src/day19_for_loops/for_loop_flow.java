package day19_for_loops;

public class for_loop_flow {
    public static void main(String[] args) {
        for(int i = 0; i <10; i++) { // i in here starts with 0 and statement i less 10 means i will run this statement 10 times
            System.out.println(i);
        }
        /*
        1) initialization is executed:
        int i =0;
        --->declaring and assigning a variable to be used in the loop. This variable that is usually used to keep track of the iteration.
        --->initialization occurs once in the beginning of the loop

        2) termination condition/ boolean value is checked
        --> if the boolean is true: the code inside the loop is executed.
        --> if the boolean is false: the loop stops.
        i <10;

        3) code inside the loop are executed top to bottom
        System.out.println(i);

        4) update
        the iteration of the variable executes
        i++;
        ---> one iteration completed
        the loop goes back to step 2 and repeats until 10.

         */
    }
}
