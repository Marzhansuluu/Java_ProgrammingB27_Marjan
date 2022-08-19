package day05_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {
        byte b=14;
        int c=b; // we won't have problem, it is automatically converts
        long l=40;// by the default 40 is int number that;s why we do not put the l.

        long l2=20000000000l;// if we need to convert to int then we need to manually
        int k=(int)l;
         float f=10; // 10 is int by default, int is smaller than float, so it will automatically will cast.
        double d=19.99;
        int i2=(int)d;// double is bigger than int, so i will need to cast to int
        int i3=500;
        byte b2=(byte)i3;
        System.out.println(b2);

        short s= 60;
        double d3=s;
        System.out.println(d3);

        float f2=(float)100.50;
        long l3=(long)f2;
    }
}
