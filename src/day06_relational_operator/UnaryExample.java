package day06_relational_operator;

public class UnaryExample {
    public static void main(String[] args) {
        int n = 0;
        n++; // post increment
        System.out.println(n);//1
        n++; // post increment
        System.out.println(n);//2
        ++n;//pre increment
        System.out.println(n);//3
        System.out.println(++n);//4; this is pre increment
        System.out.println(++n);//5; this pre increment
        System.out.println(n++);// 5; this is post increment
        System.out.println(n); // n value is 6 in here because the previous ex we did post increment
        System.out.println(++n);// 7 ; this pre increment

        System.out.println("-------------------------------------------------------");



        int x=4;
        int y=x;
        int z=++x;// pre increment
        System.out.println("x " + x);// 4
        System.out.println("y " +y);//4
        System.out.println("z " + z);// 5;
        System.out.println("-------------------------------------------------");

        int candy =5;
        System.out.println("Your kids asks for candy, you have " + candy);
        System.out.println("You gave them, so now you have " + --candy);//pre decrement subtract 1 first, then print it.
        System.out.println("The sibling comes in and they want one, you check how many there then give them one " + candy--); // post decrement
        System.out.println("Total candy in jar now " + candy);

        //use case: counting;
        //your name, we want find how many times your name as the letter 'a'
        int counter = 0;
        counter++;
        // we find another a
        counter++;

        System.out.println("--------------------------------------------------------");



    }
}
