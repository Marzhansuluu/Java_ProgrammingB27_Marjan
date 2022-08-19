package day04_variables;

public class MyName {
    public static void main(String[] args) {
        char firstLetter= 77;// these numbers are from ascii table
        char secondLetter=65;
        char thirdLetter=82;
        char fourthLetter=74;
        char fifthLetter=65;
        char lastLetter=78;
        System.out.println("My name is " + firstLetter+secondLetter+thirdLetter+fourthLetter+fifthLetter+lastLetter+".");
        //other option is
        char first='M';
        char second='a';
        char third='r';
        char fourth='j';
        char fifth='a';
        char last='n';
        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.print(fourth);
        System.out.print(fifth);
        System.out.print(last);
        System.out.println();

        System.out.println("My name is " +first+second+third+fourth+fifth+last+".");
        //or this option
        char m='M', a='a',r='r',j='j',n='n';
        System.out.println("My name is "+m+a+r+j+a+n);// this is example for printing as a sentence.

        /* if I PRINT MY NAME WITH ADDING THE QUOTATION MARK IT WILL PRINT WITH SENTENCES.Check the above example. IF i WILL NOT ADD THE QUOTATION MARK ON MY SENTENCE IT WILL PRINT JUST NUMBER BECAUSE THE COMPUTER GETS THE NUMBER FROM ASCII TABLE. FOR EXAMPLE: check the below. */

        System.out.println(m+a+r+j+a+n);// this is example M=77,a=65,r=82,j=74,a=65,n=78 that's why giving as a output 601.
    }
}
