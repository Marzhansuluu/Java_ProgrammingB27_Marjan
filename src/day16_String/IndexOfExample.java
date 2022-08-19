package day16_String;

public class IndexOfExample {
    public static void main(String[] args) {
        String s = "lollipop";
        System.out.println("index of l " + s.indexOf('l'));
        System.out.println("index of l " + s.lastIndexOf('l'));// we will  get the third l index value. which is 3.
        System.out.println("index of i " + s.indexOf('i'));
        System.out.println("index of i " + s.indexOf('i'));// since we have only 1 i, it will give us same index value.

        System.out.println("index of p " + s.indexOf('p'));// index value of p is 5
        System.out.println("index of p " + s.indexOf('p'));// index value of p is 7.

        System.out.println("index of e: " + s.indexOf('e'));// since e does not exist we will get -1.
        System.out.println("index of P: " + s.indexOf('P'));// since case sensitivity we will get as always -1
        System.out.println("index of pop: " + s.indexOf("pop"));// gives 5 because the sequence "pop starts at index 5.
        System.out.println("index of Pop: " + s.indexOf("Pop"));// -1

        System.out.println("index of lol: " + s.indexOf("lol"));// 0
    }
}
