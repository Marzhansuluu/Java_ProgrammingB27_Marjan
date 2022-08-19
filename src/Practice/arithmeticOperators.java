package Practice;

public class arithmeticOperators {
    public static void main(String[] args) {
        System.out.println(1000+2000);
        System.out.println(2.5+3.5);
        System.out.println(1000-500);//If I want to use this equation over again then I need to assign variables
        int a=1000-500;
        System.out.println(a);
        System.out.println(20*6);
        System.out.println(5.5*7);
        System.out.println(10/3); // it will print only the exact number which is 3 not decimal.
        System.out.println(10.0/3); /* 3.333 in order to get decimal number you need to convert one of the whole number or both of them into decimal number. like 10.0/3 or 10/3.0 */
        System.out.println(10/3); /* 3.333 in order to get decimal number you can type also instead of 10.0/3 like this you can put 10d/3 */
        System.out.println(10 %4 ); /* it will print only the remained number. which is 2. This how it works
        remainder: numerator-(denominator*result)
                    10      - (4        *     2)
                         =2
        */


    }
}
