package Practice.Methods;

public class ReturnMethods {

    public static void sum(int num1, int num2){
        int result = num1 + num2;
    }

    public static int sum2(int num3, int num4){
        int result2 = num3 + num4;
        return result2;
    }

    public static void main(String[] args) {
        sum(20, 40);// if I want to multiply it will not work, because my sum method is not return type.

        sum2(20, 40); // If I want to multiply, I can do that because my method is return type, as you can below line.

        int total = sum2(20, 40)*2;
    }
}
