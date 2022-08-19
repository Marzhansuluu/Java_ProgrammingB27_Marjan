package day32_arrayList;

import java.util.ArrayList;

public class GetFirstLettersLoopArrayList {
    public static void main(String[] args) {
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
