package day31_arrayList;

import java.util.ArrayList;

public class BooleanMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.isEmpty());// true, because we did not add element yet

        list.add(4);
        list.add(5);
        list.add(41);
        list.add(5512);
        list.add(413);
        System.out.println(list);//[4, 5, 41, 5512, 412]

        System.out.println("is empty: " + list.isEmpty());//false, because we added elements

        System.out.println("contains 41: " + list.contains(41));//true
        System.out.println("contains 500:  " + list.contains(5000));//false
        System.out.println("contains 1: " + list.contains(1));//false

        System.out.println("---------------------------------------");
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(4);
        list2.add(5);
        list2.add(41);
        list2.add(5512);
        list2.add(413);

        System.out.println("is list and list2 are equals: " + list.equals(list2));//true

        list2.remove(0);
        System.out.println("is list and list2 are equals: " + list.equals(list2));//false because we remove the first index element

        System.out.println("-----------------------------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(1);
        list3.add(2);
        list3.add(3);

        ArrayList<Integer> list4 = new ArrayList<>();

        list4.add(3);
        list4.add(2);
        list4.add(1);
        System.out.println("list3 + " + list3 );//[1, 2, 3]
        System.out.println("list4 = " + list4);//[3, 2, 1]
        System.out.println(list3.equals(list4));//false

    }
}
