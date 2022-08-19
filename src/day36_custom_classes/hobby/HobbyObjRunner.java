package day36_custom_classes.hobby;

import java.util.ArrayList;

public class HobbyObjRunner {
    public static void main(String[] args) {
         /*
    Create a separate class to create and test the Hobby objects

        - create an java.util.ArrayList of Hobby objects
        - create and add a couple Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
... (2 lines left)
     */
        ArrayList<Hobby> list1 = new ArrayList<>();
        list1.add(new Hobby("Dance", 1500.99, false));
    }
}
