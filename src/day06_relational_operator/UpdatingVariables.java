package day06_relational_operator;

public class UpdatingVariables {
    public static void main(String[] args) {
        int n = 10;
        // reassign a new value
        n=20;
        int a=3;
        a=a+4; // a+4--> 3+4=7 gets stores as the new value for a
        System.out.println(a);
        System.out.println("----------------------------------------");

        int b=15;
        b+=9; // b=b+9; --> b=15+9=24
        b+=1; // b=b+1; --> b=24+1=25
        System.out.println(b);
        System.out.println("--------------------------------------");

        int z=10;
        z++; // we pre increment  the z; that is z=11;
        System.out.println(z);
        /*
        z=11;
        or z=z+1;
        or z+=1;
        z++; or ++z
         */
        System.out.println("----------------------------------------------");
        int java=8;
        int testing = --java;
        System.out.println(java);// 8 ---> 7;
        System.out.println(testing);// testing value 7 because we assign for the testing variable --java which is 7.
        System.out.println("--------------------------------------------------");

        int x=7;
        int y=x--;
        System.out.println(x); // at the beginning my x value was 7 then become 6 because we decremented it.
        System.out.println(y);// the y value is 6.
    }
}
