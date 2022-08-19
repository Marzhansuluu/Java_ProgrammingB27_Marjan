package day10_if_else_elseIf_statements;

public class BiggestNumber {
    public static void main(String[] args) {
        int n = 1;
        int n2 = 3;
        int n3 = 5;
        int biggest;

        if (n > n2 && n > n3) {
            biggest= n;    //System.out.println(n + " is the biggest"); these both of them are correct.
        } else if (n2 > n3 && n2 > n3) {
            biggest = n2; //System.out.println(n2 + " is the biggest");
        } else{    //(n3 > n && n3 > n2) { // or we can use else{ then we put print n2 is the biggest} // if we won't assign biggest =0; then we should not be using else if we have to else only.// if we assign a value then we can use else if.
            biggest = n3; //System.out.println(n3 + " is the biggest"); if we use biggest variable then we need to print outside of the if/else statement we need to print biggest by itself
        }
        System.out.println(biggest + " is the biggest");// we need to print since we use biggest variable. we used biggest variable because instead of keep typing system.out println...
    }
}
