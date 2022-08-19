package Practice.NesoExamples;

public class LoopExOne {
    public static void main(String[] args) {
        /*
        Write a program which prints the even numbers between 1 and 100 in an increasing order
        ex 2,4,6,8,...
         */
        int i =0;
        for(i =2; i <= 100; i ++){
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");

        /*
        Resolve in a decreasing order
         */
        for(i =100; i >=2; i--){
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");


        //Print an odd number between 1 and 100 in an increasing order
        for(i = 0; i <= 100; i++){
            if(i % 2 ==1){
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.println("-----------------------------------------------------");

        // Print the odd numbers between 1 and 100 in a decreasing order

        for(i =100; i > 0; i--){
            if(i % 2 ==1){
                System.out.print(i + ", ");
            }
        }
    }
}
