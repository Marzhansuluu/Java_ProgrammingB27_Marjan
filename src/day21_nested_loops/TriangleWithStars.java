package day21_nested_loops;

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

        for(int i = 0; i < 8; i ++){//
            for( int j = 8; j > i; j--){ // this line will print
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
