package Practice.Arrays;

import java.util.Arrays;

public class MultiDimensionalArrayString {
    public static void main(String[] args) {
        String [][] names = {
                {"Nelly", "Nonna", "Alena"},
                {"Marjan", "Jibek", "Janan"},
                {"Mirlan", "Busra", "Karaas"}
        };
        // if I want to print "Janan"
        System.out.println(names[1][2]);// Janan

        // If I want to print entire array 2
        System.out.println(Arrays.toString(names[2]));// [Mirlan, Busra, Karaas]

        // If I want to print entire multi Dimension Arrays
        System.out.println(Arrays.deepToString(names));

        char[] letter = {'A', 'Z', 'y', 'b'};
        Arrays.sort(letter);
        for(char each : letter) {
            if (each < 'a') {
                continue;

            }System.out.println(each);
        }
    }
}
