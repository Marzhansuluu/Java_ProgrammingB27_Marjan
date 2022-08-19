package Practice.Methods;

public class MethodLoading {

    public static void main(String[] args) {
        int r1= sum(10, 20);
        int r2 =sum(20,30,10);
        int r3 = sum(10,20,30,40);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }

    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static int sum(int a, int b, int c, int d){
      //  return a+b+c+d;
        return sum(a,b,c) +d;
    }
}
