package day32_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithString {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("james", "adam", "ana", "jane")
        );
        System.out.println(names);
    }
}
