package Practice.Methods;

public class PassingArguments {
    public static void main(String[] args) {
        int x =1;
        increment(x);
        System.out.println(x);
    }

    public static void increment(int x){// in here our x value is 1. because we are initializing the x value in main method.
        System.out.println(x);
        x++;
        System.out.println(x);
    }


}
