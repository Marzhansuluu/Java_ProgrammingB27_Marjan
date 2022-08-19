package day32_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LoopList {
    public static void main(String[] args) {
        ArrayList<Integer> nums =new ArrayList<>();
        nums.add(4);
        nums.add(8);
        nums.add(9);
        nums.add(12);
        nums.add(7);
        nums.add(4);

        //get(0) get(1)
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");// array[i]

        }
        System.out.println();
        System.out.println("------------------------------------------------------");

        for (Integer each : nums) {
            System.out.print(each + " ");

        }
        System.out.println();
        System.out.println("------------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.add("Iron Man");
        words.add("Spider Man");
        words.add("Thor");
        words.add("Captain America");
        words.add("Hawkeye");
        System.out.println(words);

        //print each initial. If there is one word, then print just the first letter
        for (String each : words) {
            if(each.contains(" ")){
                int space = each.indexOf(" ")+1;
                System.out.println(each.substring(0,1) + each.substring(space, space+1));
            }else{
                System.out.println(each.charAt(0));
            }

        }
    }
}
