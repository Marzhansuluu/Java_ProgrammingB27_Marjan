package Practice;

public class ShorthandOperators {
    public static void main(String[] args) {
        //Assignment
        int a=100;
        a = 200; // assign new value(200) to a int
        System.out.println(a);
        System.out.println("-------------------------------------------------------------");

        // addition assignments
        int b=200;
        b+=100; // increase the value by 100. it will be 300.
        System.out.println(b);
        System.out.println("==================================================================");

        //subtraction Assignment
        int c=200;
        c-=100; // decrease the value by 100. it will be 100.
        System.out.println(c);
        System.out.println("=========================================================");

        //multiplication assignment
        int d=20;
        d*=5;// multiples the value by 5.it will be 100.
        System.out.println(d);
        System.out.println("----------------------------------------------------------");

        //division assignment
        int e=20;
        e/=4; //divides the value 4
        System.out.println(e);
        System.out.println("------------------------------------------------------------------------");

        //remainder assignment
        int f=200;
        f%=10;
        System.out.println(f); //the remainder will be 0. because 200/10=20 and there is remainder.


    }
}
