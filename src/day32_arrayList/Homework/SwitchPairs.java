package day32_arrayList.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SwitchPairs {
    public static void main(String[] args) {
        /*
            Switch Pairs
        Given an ArrayList of words switch position for each pair in the List. A
        pair is an element and the element next to it.
        The given ArrayList will always have an even number of elements so each
        element will always have a single pair.
        Ex:
        Input: {"Cat", "in", "the", "hat"}
        There is two pairs:
        "Cat" and "in"
        "the" and "hat"
        Output: {"in", "Cat", "hat", "the”}
         */
//        ArrayList<String> list =new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat" ,"java","world") );
//
//        if(list.size() % 2 == 0 ){
//            for (int i = 0; i < list.size(); i=i+2) {
//                Collections.swap(list, i, i+1 );
//
//           }
//        }
//        System.out.println(list);
//        String a ="";
//        if(list.size() % 2 == 0){
//            for (int i = 0; i < list.size(); i++) {
//
//               if(i % 2 == 0){
//                   a= list.get(i);
//                   list.set(i, list.get(i+1));
//               }else{
//                   list.set(i, a);
//               }
//
//
//            }
//        }
//        System.out.println(list);

        System.out.println("----------------------------------------------------------");
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat" ,"java","world") );


        for (int i = 0; i < list2.size(); i+=2) {
            String deleted = list2.remove(i);
            list2.add(i+1, deleted);
        }
        System.out.println(list2);

    }
}
