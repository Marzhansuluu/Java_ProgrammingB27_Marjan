package day31_arrayList;

import java.util.ArrayList;

public class AddMethod {
    public static void main(String[] args) {
        ArrayList<Character> letters = new ArrayList<>();// creates an empty ArrayList
        System.out.println(letters.size());// size is 0.
        letters.add('j');// in here we add element and the size is 1
        letters.add('a');//we add another element and size is 2.
        letters.add('v');
        letters.add(' ');
        letters.add('a');

        System.out.println(letters);//[j, a, v,  , a]
        System.out.println(letters.size());// size is 5.

        // reading from array: arrayName[index];

        // reading element from the ArrayList
        System.out.println(letters.get(0));// we will get 'j' because 'j' is our 0 index number
        System.out.println(letters.get(1));//'a'
        System.out.println(letters.get(2));//'v'
        System.out.println(letters.get(3));//' '
        System.out.println(letters.get(4));//'a'

        System.out.println("----------------------------");
        System.out.println(letters);

        System.out.println("------------------------------");
        // adding another element
        letters.add(0, '$');//[$, j, a, v,  , a]
        System.out.println(letters);
        System.out.println(letters.get(1));

        letters.add(3, '8');//[$, j, v, 8, v,  , a]
        System.out.println(letters);
    }
}
