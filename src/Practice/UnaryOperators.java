package Practice;

public class UnaryOperators {
    public static void main(String[] args) {
        //Positive and Negative
        int a= -100;
        int b= +200;

        boolean aIsNegative = a<0;// it will print true, because a is negative number.
        boolean bIsPositive = b>0;
        System.out.println(aIsNegative);
        System.out.println(bIsPositive);
        System.out.println("=====================================================================");

        int d = -100-20; // -120;
        int e = 10- -20; // 10+20 = 30
        int f = -10 * 4; // -40
        int g =  10 * -4; // -40
        int h = -10 * -4; // 40
        System.out.println("========================================================================");

        int k = 100;
        ++k; // 101 pre increment

        int y = 100;
        --y; // 99 pre decrement

        System.out.println("============================================================");

        int m= 2;
        int n = m++;
        System.out.println(m); // it will print 3 because we incremented it.
        System.out.println(n); // it will print 2 because we incremented after giving value
        System.out.println("================================================================");



        //Increment/decrement
        int x = 10;
        System.out.println(++x); /* when I put ++/increment before the variable it will start to increase the value right away.x value is 10 since we put increment before the variable it will print 11.

        */
        System.out.println(--x);
        System.out.println("===========================================");

        int z=20;
        System.out.println(z++);// i add ++/increment after variable that's why it will print in here 20
        System.out.println(z);// z value is in here 21; because in the above i apply increment.
        System.out.println(z--);// z value in here it will show 21 because I apply the decrement after the variable.
        System.out.println(z); // in here z value is 20 because I applied the decrement after the variable
        System.out.println("===========================================================================");

        int a1 = 1;
        int b1 = -a1-- + a1++ / -a1--*--a1;// a-a--= -1; a+ a++ = 0; a-a--=-1; a-a=-1
        //  b1 = -1   + 0   /  -1   *  -1
        //  b1 = -1   + 0           *   1
        // b1  = -1   + 0
        // b1  = -1
        System.out.println("=====================================================================");


        int A = 50;
        int B = --A + A++ + A-- + A++;// 49, 50, 49, 50

        //  B =  49 + 49  + 49  + 49;
        // B  =  49 + 49  +49   + 50;
        // B =   197
        System.out.println(B);
        //System.out.println(B);


    }
}
