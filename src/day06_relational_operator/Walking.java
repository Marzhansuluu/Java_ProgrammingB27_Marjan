package day06_relational_operator;

public class Walking {
    public static void main(String[] args) {
        boolean isRaining =false;
        double temperature = 80.5;
        boolean goWalk= temperature >=68 && isRaining == false;
        // ! is raining
        System.out.println("Should I go walk :" + goWalk);
        /*
        create a class Walking
  declare and assign a boolean variable is raining
  declare and assign a temperature variable
  check if you should go for a walk. You should go for a walk if it is not raining and the temperature is more than 68
         */
    }
}
