package day21_nested_loops;

public class nestedLoop2 {
    public static void main(String[] args) {
        for( int i = 0; i < 8; i++){
            for(int j = 0; j < i; j++){// inner loop checks everytime from 0.
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
