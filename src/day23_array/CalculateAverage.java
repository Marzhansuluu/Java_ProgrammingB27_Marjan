package day23_array;

public class CalculateAverage {
    public static void main(String[] args) {
        double[] prices = {13.99, 19.14, 3.12, 65.77};

        double sum =0;
        for(double price : prices){
            sum += price;

        }
        System.out.println(sum / prices.length);// prices.length is basically total 4 elements.


        /* THIS IS TRADITIONAL LOOP
        double sum =0;
        for(int i =0; i< prices.length; i++){
            sum += prices[i];

        }
        System.out.println(sum / prices.length);// prices.length is basically total 4 elements.
         */

        // eachPrice == prices[i]--> same
    }
}
