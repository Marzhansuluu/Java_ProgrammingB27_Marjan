package day32_arrayList.Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class PasswordHide {
    public static void main(String[] args) {
        ArrayList<String> passwords = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
        System.out.println(passwords);

        String stars = "*";
        ArrayList<String> newPassword = new ArrayList<>();

        for (String each : passwords) {
            newPassword.add(stars.repeat(each.length()));
        }
        System.out.println(newPassword);
    }
}
