package day10_if_else_elseIf_statements;

public class SaleBonus {
    public static void main(String[] args) {
        int sales = 16_000;
        if(sales >= 10_000 && sales < 15_000 ){
            System.out.println(" Your sales: $" + sales + ". Yehuu you will get extra $5000 bonus.");
        }else if(sales >= 15_000){
            System.out.println("Your sales: $" + sales + ". Yay you will get $7000 bonus.");
        }else{
            System.out.println("your sales: $" + sales + ". Sorry you will not get any bonuses.");
        }


               /*
        create a sales amount variable
use the sales amount to determine the bonus you get at end of the month
if your sales amount is less than 10000 you don't get any bonus
if your sales amount is more than or equal to 10000 and less than
15000 you get a bonus of 5000
if your sales amount is more than or equal to 15000 you get a bonus
of 7000
         */
    }
}
