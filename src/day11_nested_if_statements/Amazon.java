package day11_nested_if_statements;

public class Amazon {
    public static void main(String[] args) {
        double price = 10.99;
        boolean isPrime = true;

        if(isPrime){// I have prime that's why the rest of my code will not run. if my boolean is false the rest of the code will run.
            System.out.println("Free 2 day shipping");
        }else{//you do not have prime
            if(price >=25){// if the price is $25 then the if print will print
                System.out.println("Free shipping available");
            }else{// if the price is less than $25 then my else print will print
                System.out.println("Shipping cost is $2.99");
            }
        }
    }
}
