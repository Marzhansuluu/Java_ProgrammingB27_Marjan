package day29_methods;

public class ExtraPractices {
    public static void main(String[] args) {
        int[] nums = {1,24,5,12};
        System.out.println(sumFromArray(nums));

        System.out.println(currencyConverter("yen", 100));
        System.out.println(currencyConverter("won", 100));
        System.out.println(currencyConverter("EURO", 100));
        System.out.println(currencyConverter("peso", 100));
    }
    /*
    Create a method that accept an int array. Take the sum o the numbers and return the sum
     */
    public static int sumFromArray (int[] nums){// when we put the array as a parameter it is more dynamic. we are declaring the method but no value yet.
        int sum =0;
        for(int eachNum : nums){
            sum +=eachNum;
        }
        return sum;
    }

    public static double currencyConverter (String type, double dollars){
        double converted =0.0;
        switch(type.toLowerCase()){
            case "euro":
                converted = dollars * 0.91;// return dollar * 0.91
                break;
            case "yen":
                converted = dollars * 121.03;
                break;
            case "lira":
                converted = dollars * 14.85;
                break;
            case "won":
                converted = dollars * 1_217.52;
                break;
            case "rupee":
                converted = dollars * 181.45;
                break;
            default:
                System.out.println("we cannot convert to " + type);
        }
        return  converted;
    }


}
