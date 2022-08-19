package Practice;

public class PrimitiveCasting {
    public static void main(String[] args) {
        // implicit casting;
        int a=100;
        double b=a; /* it will print 100.0 because it is decimal number.and when you are casting a smaller to a larger you do not need to do manually, the computer will do automatically.*/

        System.out.println(a);
        System.out.println(b);

        // explicit casting;
        double x=20.5;
        //int y=x; //it will not gonna cast automatically, because double is bigger than int.that's why we will do manually
        int y=(int)x; // now it will cast properly, because we did manually.
        System.out.println(x);
        System.out.println(y);
    }
}
