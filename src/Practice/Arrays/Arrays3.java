package Practice.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        String [] fruits = {"apple", "grape", "cherry", "pear", "banana"};

        for(String each : fruits){
            System.out.println(each);// it will print each element
        }

        System.out.println();
        for(int i = fruits.length-1; i >=0; i--){
            System.out.println(fruits[i]);
        }
    }
}
