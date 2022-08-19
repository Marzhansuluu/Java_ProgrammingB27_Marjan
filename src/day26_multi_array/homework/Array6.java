package day26_multi_array.homework;

public class Array6 {
    public static void main(String[] args) {
        int [][] integers ={
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
             for(int i =0; i < integers.length; i++){
                 int sum = 0;
                 for(int j =0; j< integers[i].length; j++){
                     sum += integers[i][j]; //i=0, j=0; i=0, j=1...j=3; i=1
                 }
                 System.out.println("the sum of the row "+(i+1) +": "+ sum);
             }

    }
}
