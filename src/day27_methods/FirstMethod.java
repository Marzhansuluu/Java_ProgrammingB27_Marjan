package day27_methods;

public class FirstMethod {

    public static void helloWorld(){//we created a function/method to print hello world.
        System.out.println("Hello World!");
    }

    public static void helloWorld5Times(){// we created another function/method, and called the first function/method inside the second function/ method.
        for(int i = 0; i < 5; i++){
            helloWorld();
        }
    }

    public static void main(String[] args) {
        helloWorld();// I called the hello world function/method
        System.out.println();

        // print hello world 5 times
        helloWorld5Times();// in here we call the print 5 times function/ method.

    }

}
