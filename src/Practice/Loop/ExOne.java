package Practice.Loop;

public class ExOne {
    public static void main(String[] args) {
        int num = 5;
        while(num >= 0) { //iter 1; 1<5 true, itera 2;
            System.out.println("hi" +num);//1,2

            num--;//iteration 1; num=1, iter2 num2,
        }
        System.out.println("------------------------------------");
            for(int num1 =5; num1 >= 0; num1--){
                System.out.println("hi" +num1);
            }

    }
}
