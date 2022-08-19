package day06_relational_operator;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean isWeekend = false;
        boolean isGoodTemp = true;
        boolean doBbq = isWeekend && isGoodTemp;
        System.out.println(doBbq);

        System.out.println("------------------------------------");
        boolean doBqq2 = isWeekend || isGoodTemp;

        System.out.println(doBqq2);
        System.out.println("------------------------------");

        boolean isTeacher = true;
        boolean isPolice = false;
        boolean isFireFighter= false;
        boolean getDiscount = isTeacher || isPolice || isFireFighter;
        System.out.println("getDiscount = " + getDiscount);

        System.out.println("------------------------------------");

        //goal 5 < number <10;
        int number = 8;
        System.out.println( number >5 && number <10 ); // true && true --> true
        System.out.println(number >0 && number < 5 ); // true && true ----> false


        int age = 40;
        boolean inValidAge = age < 0 || age > 120; // false || false ---> false


    }

}
