package day06_relational_operator;

public class GiftCard {
    public static void main(String[] args) {
        int giftCardBalance=500;
        int timeUsed=3;
        System.out.println("The remaining balance after first usage " + (giftCardBalance= giftCardBalance- 150) + "\nTimes remaining:  " + --timeUsed );
        System.out.println("The remaining balance after second usage " + (giftCardBalance = giftCardBalance - 99) + "\nThe remaining times usage " +--timeUsed);


        /*
        declare and assign a gift card variable at 500
    declare and assign times used at 3
    print using giftcard and subtract 150 from the amount
    reduce the times used by one
    print using giftcard and subtract 99 from the amount
    reduce the time used by one
    print information at the end
         */
    }
}
