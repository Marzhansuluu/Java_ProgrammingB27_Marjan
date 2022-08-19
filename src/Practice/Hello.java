package Practice;

public class Hello {
    public static void main(String[] args) {
        //()---> priority
        //  * or / or % -->2nd priority
        //

//                              1, 1
        System.out.println(sum(1, sum(0, 1)));//

    }

    private static int sum(int a, int b) {// iteration 1-->a=0 b =1. iteration 2--> a=1 b=1
        if(a+b >1)//iter 1-->false; iter 2 --> true
            return 0;// iter 1 skipped; iter 2-->0
        System.out.print(a+b);// 0+1 iter 1 ; iter 2--> we did not come this part because our if statement was correct.
        return a+b;//1
    }
}
