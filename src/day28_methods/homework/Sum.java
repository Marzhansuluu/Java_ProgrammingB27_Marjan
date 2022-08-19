package day28_methods.homework;

public class Sum {
    /*
    Create a method that accept an int array. Take the sum of all the numbers
and return the sum
     */
    public static int sum(int [] nums){

        int result =0;
        for(int each : nums){
            result += each;// 1+2+3
        }
        return result;
    }

    public static void main(String[] args) {
        int []numbers = {1,2,3,4,5,6};
        System.out.println(sum(numbers));
    }


}
