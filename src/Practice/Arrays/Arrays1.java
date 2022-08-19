package Practice.Arrays;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int [] score = new int[2];// in here I decalre an array and I reserved 2 elements size
        score[0] = 12; // In here I assign 12 to first element
        score [1] = 10;

        System.out.println(score[0]);// it will print me the first element
        System.out.println(Arrays.toString(score));// it will print me entire array

        for(int i =0; i < score.length; i++){
            System.out.println(score[i]);// it will print me each element in new line



        }
    }
}
