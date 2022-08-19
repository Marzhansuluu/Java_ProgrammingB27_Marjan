package Practice;

public class trueFalse {
    public static void main(String[] args) {
        boolean x =false;
        boolean y = !x;// true
        boolean z = x == true; // (x)false==true; they are not equal, that's why z is false

        if(x){
            System.out.println("hello");
        }
        if(y){
            System.out.println("bye");
        }
        if(z){
            System.out.println("print");
        }
    }
}
