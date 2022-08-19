package day27_methods;

public class Parameters {
    public static void greeting(String name){// my method has parameter. our name is parameters. But my parameter is empty
        System.out.println("Hello " + name);
        System.out.println("Nice to meet you " + name);
    }

    public static void age(int birthYear){
        System.out.println("You are " + (2022 -birthYear) + " years old.");
    }

    public static void main(String[] args) {
        greeting("James");// it is expecting to put arguments/ value. after I put "James" the red line disappeared. James is an argument, value of the name for method.
        greeting("Kelly");//it is expecting to put arguments/ value. after I put "Kelly" the red line disappeared. Kelly is an argument, value of the name for method.

        age(2000);
        age(1988);
    }

}
