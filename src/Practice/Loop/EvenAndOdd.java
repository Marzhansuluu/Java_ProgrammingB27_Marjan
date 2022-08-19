package Practice.Loop;

public class EvenAndOdd {
    public static void main(String[] args) {
        int limit = 100;
        int count = 1;

        // printing all the even numbers
        while(count <= limit){
            if(count % 2 == 0){
                System.out.print(count +", ");
            }
            count++;

        }
        System.out.println();
        System.out.println();

        int backward = limit;

        while(backward >= 1){
            if(backward % 2 == 1){
                System.out.print(backward + " ");
            }
            backward--;
        }
    }
}
