package day32_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(10, 20, 10, 300, 400, 300));

        System.out.println(num);

        num.remove(num.lastIndexOf(300));// In here I remove the last 300.
        System.out.println("after the last index removed" + num);

        System.out.println(num);
        num.remove(0); // in here I remove the 10
        num.remove((Integer)300);// in here I remove the 300, I had to do casting if I will just put num.remove(300) it will be wrong because the code accept the 300 as a index number.
        System.out.println(num);
    }
}
