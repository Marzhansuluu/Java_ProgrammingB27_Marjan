package Practice.Loop;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 5;

        for(int i =1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        System.out.println();
        System.out.println();
        for(int a =20; a >= 1; a--){
            System.out.println(num + " * " + a + " = " + (num * a));
        }

        for(char letter = 'A'; letter <= 'Z'; letter++ ){
            System.out.print(letter +" ");
        }
    }
}
