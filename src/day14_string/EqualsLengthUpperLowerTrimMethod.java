package day14_string;

public class EqualsLengthUpperLowerTrimMethod {
    public static void main(String[] args) {
        String item = "pen"; // this is in string pool. this is string literal
        String item2 = new String("pen");// this is in heap. this is new keyword
        System.out.println(item == item2); //checks if the object item is the same object as item2. it will false because they are different object.


        String item3= new String("pen");// inside of the heap
        System.out.println(item2 == item3);// compares the two objects. They are same both in heap, but they are different objects.

        // in the below we will learn how to compare the string objects. we cannot use == symbol to compare the string.
        System.out.println(item.equals(item2));//
        System.out.println(item2.equals(item3));
        System.out.println(item3.equals("pen"));//true

        System.out.println(item.equals("Pen"));//false/ checks for exact characters including cases. Because P is capital that's it will give false
        System.out.println(item.equalsIgnoreCase("Pen"));//true/  checks only for matching characters and ignores all the cases. in here P is still capital letter but this method ignores the capital or lower cases.

        System.out.println("=====================================================");

        String username = "jamesbond";
        String password = "BOND007";
        System.out.println(username.equals("jamesbond"));//true
        System.out.println(password.equals("bond007"));//false
        System.out.println(password.equalsIgnoreCase("bond007"));// true because we use equals ignore case method.

        System.out.println("=======================================================");

        String month ="January";// 6
        System.out.println(month.length());// counts how many character there is. this one prints only once
        String day2= "Friday";
        int len = month.length();// we declare the len in that way we can reuse it.
        System.out.println(len + 10);
        System.out.println(len +5);

        String str = " hello world ";// i put space before and after. the character 'hello' are 5 long but spaces are also character, so the space in the beginning and end are included, which mean the total length is 7. it will give length method 7.
        System.out.println(str.length()); // prints how many characters the String has, not the String.
        System.out.println(str);// it will just print our String variable
        System.out.println("===================================");

        String word = "Summer";
        word.toUpperCase();
        System.out.println(word.toUpperCase());
        System.out.println(word);// it is not gonna print me Summer with upperCase.Because the string is immutable/unchangeable. In order to print Summer with UpperCase I need to replace it word = word.toUpperCase(); But we will lose the first Summer/ value. Basically we will replace the value with SUMMER. These are two different object. Summer and SUMMER.

        word = word.toUpperCase();//this time we make all the characters uppercase, then the String it gives us back all uppercase was reassigned into the value.
        System.out.println(word);
        System.out.println(word);

        System.out.println("======================================================");

        String sentence = "hello My NAME is";
        System.out.println(sentence);// original one
       System.out.println("printing the sentence value with lower case: " + sentence.toLowerCase());// all in lower case
       System.out.println(sentence); // i will see original string, the string is immutable it cannot change.
       String lowerVer = sentence.toLowerCase();// we just created a new variable.we did not print.
        String abc = sentence.toUpperCase();
        System.out.println("abc value upper case: " + abc);
       System.out.println(lowerVer);// it will print all in lower case we declare the new variable/object it is just printing the value for this variable/object.
        System.out.println(sentence);//this will print the original sentence
        //option 3;
        sentence = sentence.toLowerCase();// reassign the value then we lose the first string value.
        System.out.println("after replacing the value " + sentence);

        System.out.println("===============================================================");

        String s = "       java        ";
        System.out.println(s);
        System.out.println(s.length());// this length will be 19. because every spaces are matter for length method.
        s = s.trim();// trim() method gets rid of all the extra spaces in the beginning end of the a String
        System.out.println(s);
        System.out.println(s.length());// it will print 4 because we use the trim to get rid of the spaces.

        String s2= "   multiple words here     ";
        System.out.println(s2);
        System.out.println(s2.length());// in here the s2 has 27 characters.
        System.out.println(s2.trim());// trim will remove from beginning and end, middle spaces will not be touched.
        s2 = s2.trim();
        System.out.println(s2.length());// now length method will print 19 because we have total of 19 characters.

    }
}
