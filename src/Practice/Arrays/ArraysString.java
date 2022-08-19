package Practice.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysString {
    public static void main(String[] args) {


        String[] s = {"red", "blue", "yellow", "orange", "white"};

        System.out.println(Arrays.toString(s));// [red, blue, yellow, orange, white]
        System.out.println(s[3]);// orange

        for(int i =0; i <s.length; i++){
            System.out.println(s[i]);// red blue yellow orange white in each line
        }

        System.out.println();
        for(int i = s.length -1; i >=0; i--){
            System.out.println(s[i]);// white orange yellow blue red
        }

    }
}
