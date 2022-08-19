package day20_loops;

public class OddEvenPrintingNumbersBackwards {
    public static void main(String[] args) {
        int i;
        // this
        for( i = 1; i <= 100; i++){ // if we don't want to use if then we can do instead of i=1" i =2 and 'i++' we can do "i +=2"
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }

        }
        /* This is for printing number 100, 98,96
        for(i = 100; i >= 1; i--){
            if(i % 2 == 0)
            System.out.print(i + ", ");
            }
          }
         */

        // solving a problem with while loop
        //int =1;
//        while(i <= 100){
//    if(i % 2==0)
//        System.out.println(i + ", ");
//    i++;
//        }


    }
}
