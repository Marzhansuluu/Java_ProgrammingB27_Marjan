package Practice.Methods;

public class MethodEx1 {
    /*
    Write a method that gets the name of the user and a method that gets the age of user.
     */
    public static void main(String[] args) {
        System.out.println(getName("Marjan"));
        System.out.println(getAge(34));
    }
    public static int getAge(int age){
        return age;
    }
    public static String getName(String name){
        return "Your name is " + name;
    }
}
