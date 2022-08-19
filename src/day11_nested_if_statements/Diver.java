package day11_nested_if_statements;

public class Diver {
    public static void main(String[] args) {
        int tank = 90;
        String result = "";

        if(tank >= 90){
            result = "Your tank is full";
        }else if(tank >= 80){
            result = "Still okay";
        }else if(tank >=70){
            result = "Don't go too far";
        }else if(tank >= 60){
            result = "Start to head back";
        } else if (tank >=50) {
            result = "Be careful now you at at 50%";
        } else{
            result = "Just go back quickly";
        }
        System.out.println(result);
        /*
        create a class Diver
You are diving in the ocean. Your oxygen tank has a certain level (number)
declare and assign a int variable about the oxygen level in the tank and
print a message based on the oxygen level:
Above 90 - Your tank is full
Above 80 - Still okay
Above 70 - Don't go too far
Above 60 - Start to head back
Above 50 - Be careful now you at 50%
         */
    }
}
