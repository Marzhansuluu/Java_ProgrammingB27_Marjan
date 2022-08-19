package day21_nested_loops;

public class PrintNumberOneToFive {
    public static void main(String[] args) {
        //print 1-5 5 times like this
        // iteration 1: 1 2 3 4 5
        // iteration 2: 1 2 3 4 5
        // iteration 3: 1 2 3 4 5
        // iteration 4: 1 2 3 4 5
        // iteration 5: 1 2 3 4 5


//        for(int i =1; i <= 5; i++) { // i=1, i=2, i=3, i=4, i=5
//            System.out.print(i + " ");
//        }
        // it will print me 1 to 5.
            // if I need to print 1-5, 5 times
            //then without nested loop I need to do like this
//            for (int i = 1; i <= 5; i++) { // i=1, i=2, i=3, i=4, i=5
//                System.out.print(i + " ");
//                System.out.println();
//                for (int i = 1; i <= 5; i++) { // i=1, i=2, i=3, i=4, i=5
//                    System.out.print(i + " ");
//                    System.out.println();
//                    for (int i = 1; i <= 5; i++) { // i=1, i=2, i=3, i=4, i=5
//                        System.out.print(i + " ");
//                        System.out.println();
//                        for (int i = 1; i <= 5; i++) { // i=1, i=2, i=3, i=4, i=5
//                            System.out.print(i + " ");
//                            System.out.println();
//
//                        }
//                    }
//                }
//            }



        // NOT TO DUPLICATE the CODE we use nested loop
        for(int i =1; i <= 5; i++) { // i=1, i=2, i=3, i=4, i=5
            for(int j =1; j <=4; j++){
                System.out.print(i+ " iteration: " + j + ", ");// we need to print 'j' because j is printing the numbers.
            }
            System.out.println();
        }
/*
//print 1-4 5 times like this
        // iteration 1: 1 2 3 4
        // iteration 2: 1 2 3 4
        // iteration 3: 1 2 3 4
        // iteration 4: 1 2 3 4
        // iteration 5: 1 2 3 4
 */

    }
}
