package day21_nested_loops;

public class SquareWithStars {
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
        for(int a =8; a > 0; a++){
            for(int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
