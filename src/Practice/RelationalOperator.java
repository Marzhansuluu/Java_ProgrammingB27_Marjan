package Practice;

public class RelationalOperator {
    public static void main(String[] args) {
        // greater than;
        boolean result1 = 100 > 90;
        boolean result2 = 200>300;
        System.out.println(result1);
        System.out.println(result2);

        System.out.println("-------------------------------------------------");

        // greater than or equal;
        boolean result3 = 10 > 9;
        boolean result4= 100 >= 100;
        System.out.println(result3);
        System.out.println(result4);

        //less than;
        boolean result5 = 10 < 12;
        boolean result6 = 10 < 8;
        System.out.println(result5);
        System.out.println(result6);

        System.out.println("=======================================================");
        //less than or equal;
        boolean result7 = 10<= 10;
        boolean result8 = 10 <= 9;
        System.out.println(result7);
        System.out.println(result8);

        System.out.println("-------------------------------------------------------------");

        //equal;
        boolean result9 = 10==10;
        boolean result10 = 100==200;
        System.out.println(result9);
        System.out.println(result10);

        System.out.println("--------------------------------------------------------------------");

        // Not Equal;
        boolean result11 = 1000!=2000;
        boolean result12 = 1000!= 1000;
        System.out.println(result11);
        System.out.println(result12);


    }
}
