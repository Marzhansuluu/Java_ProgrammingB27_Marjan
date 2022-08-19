package day21_nested_loops.Homework;

public class squareWithStars {
    public static void main(String[] args) {
        /*
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         */

        for( int i = 1; i < 8; i++){

            for(int j = 0; j <= 8; j++){// inner loop checks everytime from 0.
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
