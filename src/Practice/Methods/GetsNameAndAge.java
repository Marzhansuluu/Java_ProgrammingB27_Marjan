package Practice.Methods;

import java.util.Scanner;

public class GetsNameAndAge {

    public static void main(String[] args) {
String a = getName(new Scanner(System.in).nextLine());
int num = getAge(new Scanner(System.in).nextInt());
        System.out.println("Your name is "+a);
        System.out.println("You are "+num + " years old");
    }


    public static int getAge (int age){

        return age;
    }

    public static String getName(String name){

        return name;
        //Or we can do like this to
        //return  new Scanner (System.in).nextLine();
    }
}
