package Practice;

public class LogicalOperators {
    public static void main(String[] args) {
        //logical AND;
        boolean result1 = 10 > 5 && 10 > 7;
                         //true && true=true
        System.out.println(result1);
        System.out.println("--------------------------------------------------------------------");

        boolean result2 = 20 > 15 && 20 > 25;
                          //true && false=false
        System.out.println(result2);
        System.out.println("-----------------------------------------------------------------------");

        boolean result3= 30 > 50 && 30 > 10;
                         // false && true  = false
        System.out.println(result3);
        System.out.println("------------------------------------------------------------------------");

        //Logical OR: either
        boolean result4 = 100==200 && 100!=300;
                       // false && true= true
        System.out.println(result4);
        System.out.println("----------------------------------------------------------------------");

        boolean result5 = 1000>900 && 1000<2000;
                       // true     &&   true= true
        System.out.println(result5);
        System.out.println("-----------------------------------------------------------------------");

        boolean result6 = 7<0 || 7>15;
                      // false || false = false
        System.out.println(result6);
        System.out.println("----------------------------------------------------------------------");

        // Logical NOT;
        boolean result7 = !true;
        boolean result8 = !false;
        System.out.println(result7);
        System.out.println(result8);
    }
}
