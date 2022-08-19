package day15_String;

public class StringMethod2 {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.startsWith("our starts with j: " + "j"));// this will give me true
        System.out.println(word.startsWith("J"));// this will give me false
        System.out.println(word.startsWith("ja"));// this will give true
        System.out.println(word.startsWith("jae"));// this will give false
        System.out.println(word.startsWith("java"));//true


        System.out.println(word.endsWith("java"));//true
        System.out.println(word.endsWith("a"));// this will give me true
        System.out.println(word.endsWith("va"));// this will give me true

        System.out.println("=========================================");

        String str = "today it is 80 degrees";
        System.out.println("str.contains(today)" + str.contains("today"));
        System.out.println("str.contains (it is)" + str.contains("it is"));
        System.out.println("str.contains (degrees)" + str.contains("degrees"));
        System.out.println("str.contains (it 80) exact sequence " + str.contains("it 80")); // it will give me false because this method will look for exact same sequence.
        System.out.println(str.contains("80") && str.contains("today"));
        System.out.println("str.contains (day) "+ str.contains("day"));// today has day letters


    }
}
