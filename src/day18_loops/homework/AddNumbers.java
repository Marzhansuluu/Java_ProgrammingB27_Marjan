package day18_loops.homework;

public class AddNumbers {
    public static void main(String[] args) {
        /*
write a program that will add all the numbers from 1 - 500
         */
        int num = 0;// I declare initial value for the number
        int sum = 0;// i declare the initial value for the sum

        while(num < 500){
            num++;// i put this post increment in that way, the number starts from 1 to 500.
            sum =sum + num;// the starting value for the sum is 0,
        }
        System.out.println("sum: " + sum);
    }
}
