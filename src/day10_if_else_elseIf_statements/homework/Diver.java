package day10_if_else_elseIf_statements.homework;

public class Diver {
    public static void main(String[] args) {
        int oxygenLevel = 40;
        String result = "";

        if(oxygenLevel >= 90){
            result = "Your tank is full"; // System.out.println(" Your tank is full);

        }else if(oxygenLevel >= 80 ){ // true
            result = "Still okay";

        }else if(oxygenLevel >= 70){
            result = "Don't go too far";

        }else if(oxygenLevel >= 60){
            result = "Start to head back";

        }else if (oxygenLevel >= 50){
            result = "Be careful now you at at 50%";

        }else{
            result = "You need to hurry up to go out.";
        }
        System.out.println(result);
        /*
        create a class Diver
You are diving in the ocean. Your oxygen tank has a certain level (number)
declare and assign a int variable about the oxygen level in the tank and
print a message based on the oxygen level:
below 90 - Your tank is full
Above 80 - Still okay
Above 70 - Don't go too far
Above 60 - Start to head back
Above 50 - Be careful now you at at 50%
         */
    }
}
