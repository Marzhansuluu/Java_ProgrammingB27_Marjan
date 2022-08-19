package day18_loops;

public class EvenAndOdd {
    public static void main(String[] args) {
        int limit = 100;
        int count = 1;
        //printing all the even numbers

        while(count <= limit){// designed to run for limit number of times. go from 1 to limit. Every iteration checking the statement is true
            if(count % 2 ==0){

                System.out.print(count + ", ");
            }
            count++;// we can not put ++ inside of the "if statement" because


        }
        System.out.println();
        System.out.println();

        // print all the odd numbers from limit to 1, backwards order
        int back = limit;// starting number based on the limit variable

        while(back >= 1){
            if(back % 2 == 1){//checks for odd !=0.
                System.out.print(back + ", ");
            }
            back--;
            // we can do this way too.
        }




    }
}
