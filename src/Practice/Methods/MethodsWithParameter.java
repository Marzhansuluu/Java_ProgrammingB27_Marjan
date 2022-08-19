package Practice.Methods;

public class MethodsWithParameter {
    public static void oddOrEven(int num){
        if(num % 2 ==0){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }

    }

    public static void main(String[] args) {
        oddOrEven(200);
    }
}
