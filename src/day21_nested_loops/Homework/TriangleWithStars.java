package day21_nested_loops.Homework;

public class TriangleWithStars {
    public static void main(String[] args) {
        /*
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        for( int i = 0; i < 8; i++){
            for(int j = 8; j > i; j--){// inner loop checks everytime from 0.
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
