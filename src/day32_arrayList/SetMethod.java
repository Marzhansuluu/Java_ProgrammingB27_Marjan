package day32_arrayList;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(0);
        list.add(12);
        System.out.println(list);//[4, 9, 0, 12]

        list.set(2,10);// changes the element at index 2, to be the value of 10
        System.out.println(list);//[4, 9, 10, 12]

        list.set(0, 2); //changes the element at index 0, to be the value of 2
        System.out.println(list);//[2, 9, 10, 12]

        System.out.println("-----------------------------------------------");

        ArrayList<String> str = new ArrayList<>();
        str.add("friday");
        str.add("off");
        str.add("study");
        str.add("relax");

        System.out.println(str);

        int indexOfRelax = str.indexOf("relax");
        str.set(indexOfRelax, "coding");
        System.out.println(str);

    }
}
