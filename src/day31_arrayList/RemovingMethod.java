package day31_arrayList;

import java.util.ArrayList;

public class RemovingMethod {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("today");
        words.add("raining");
        words.add("java");
        words.add("flying");
        System.out.println(words);
        System.out.println("--------------------------------------------------------");

        //removing an element
        words.remove(2);//[today, raining, flying] we remove java
//        String a = words.remove(2);// if we want to reuse it, we need to assign to a new string.
//        System.out.println("This is assigned to a new string "+a);

        System.out.println(words);//[today, raining, flying]

        System.out.println(words.remove(0));// if we remove like this it will show which element got removed.
        System.out.println(words);//[raining, flying]


        // EMPTYING/DELETING the ArrayList
        words.clear();// this method will empty the whole ArrayList
        System.out.println(words);
        System.out.println("----------------------------------------------------------");

        // I am adding more ArrayList the words String
        words.add("jumping");
        words.add("barn");
        words.add("cow");
        words.add("chicken");
        System.out.println(words);//[jumping, barn, cow, chicken]

        System.out.println("------------------------------");
        words.remove("barn");
        System.out.println(words);//[jumping, cow, chicken]

        System.out.println(words.remove("Cow"));// it will give me false, because case sensitivity
        System.out.println(words);//[jumping, cow, chicken]

        System.out.println("----------------------------------");
        ArrayList<Integer> nums =new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(0);// if I want to remove 0, how do I do it?
        nums.add(2);
        nums.add(4);

        nums.remove(0); // it will remove 4.
        System.out.println(nums);//[5, 0, 2, 4]

        Integer a = 0;
        nums.remove(a);//removes element
        System.out.println(a);// it will just give 0. a is Integer, so it removed by element , the element it removes 0
        System.out.println(nums);//[5, 2, 4] we removed the 0 element not index. previous we had [ 5, 0, 2, 4]

        nums.add(1, 0);//I re-added the 0 again the same index number.[ 5, 0, 2, 4]

        nums.remove((Integer) 0); // I want to remove again 0.
        System.out.println(nums); //[5, 2, 4]

        nums.add(0,4);
        System.out.println(nums);
        nums.remove((Integer) 4);
        System.out.println(nums);
    }
}
