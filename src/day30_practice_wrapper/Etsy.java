package day30_practice_wrapper;

public class Etsy {
    public static void main(String[] args) {
        String s = "Item(s) total: $144.99";
        double price = Double.parseDouble(s.split(" ")[2].substring(1));// we will get 144.99 without dollar sign
        System.out.println(price);// 144.99
    }
}
