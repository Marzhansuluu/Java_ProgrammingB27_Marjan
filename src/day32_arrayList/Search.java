package day32_arrayList;

import my_utils.EasyData;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("friday", "java", "summer", "reading", "coding", "coding", "java", "summer"));

        System.out.println(searchInList(list,"java"));//2
        System.out.println(searchInList(list, "coding"));//2
        System.out.println(searchInList(list, "friday"));//1

        //Testing the EasyData


        ArrayList<String> days = EasyData.getDaysOfWeek();
        System.out.println(days);

    }
    public static int searchInList(ArrayList<String> list, String target){
        int counter = 0;
        for(String each : list){
            if(each.equalsIgnoreCase(target)){
                counter++;
            }
        }
        return counter;



    }
}
