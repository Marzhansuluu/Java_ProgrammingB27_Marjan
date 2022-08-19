package day07_scanner;

public class GiftCard {
    public static void main(String[] args) {
        double giftCard = 500.0;
        int uses = 3;
        System.out.println("Using gift card. $150 removed" );
        giftCard -= 150; // giftCard = giftCard-150;
        uses--;// we did post decrement because we took away 150 from gift card.
        System.out.println(" Using gift card $99 removed ");
        giftCard -= 99;
        uses--;
        System.out.println("Gift Card balance left $ " +giftCard);
        System.out.println("Number of times card can be used " + uses);


        /*
        create a class GiftCard

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
