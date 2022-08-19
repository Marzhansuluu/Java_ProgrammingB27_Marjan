package day09_statements;

public class IfStatementPractice {
    public static void main(String[] args) {
        int num1= 50;
        int num2 = 45;
        if(num1 > num2){
            System.out.println(num1 + " is bigger");
        }else{
            System.out.println(num2 + " is bigger");
        }
        System.out.println("=======================================");
        int num3 = 50;
        int num4 = 45;
        int num5 = 100;
        if(num3 > num4 && num3 > num5 && num4 > num5 && num4 > num3 ){
            System.out.println(num3 + " is bigger");
        }else{
            System.out.println(num5 + " is biggest");
        }
    }
}
