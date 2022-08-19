package day32_arrayList;

import java.util.ArrayList;

public class NameArrayList {
    public static void main(String[] args) {
        ArrayList<Character> name = new ArrayList<>();
        name.add('S');
        name.add('a');
        name.add('i');
        name.add('m');

        System.out.println(name.get(0));
        System.out.println(name.get(1));
        System.out.println(name.get(2));
        System.out.println(name.get(3));
    }
}
