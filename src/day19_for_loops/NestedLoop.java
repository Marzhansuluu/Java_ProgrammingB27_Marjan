package day19_for_loops;

public class NestedLoop {
    public static void main(String[] args) {

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++)
                System.out.println(i + " " + j);

            System.out.println();
        }
    }
}
