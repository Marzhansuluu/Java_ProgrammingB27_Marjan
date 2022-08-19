package day17_loops;

public class relativeCheckerSubstringIndexOfEndsWithMethod {
    public static void main(String[] args) {
        /*
        Given two full names check if the two people are related. They will be considered to be related if they have the same last name

    Input:
        James Bond
        Jamie Bond
    Output:
        Related

    -------------------

    Input:
        James Bond
        Alex Benji
    Output:
        Not Related
         */

        String name1 = "James Bond";// nextLine()
        String name2 = "Jamie Bond"; // nextLine()

        int indexOfSpace = name1.lastIndexOf(' ');// we use only single quotation mark because we have only one space, if we have 2 or more character in that case we will use double quotation mark. since string takes more memory we preffer to use single if we are looking for one character.

        String lastName = name1.substring(indexOfSpace +1);// we did plus 1 because there is a space between name and last name. // name1.substring(indexOfSpace).trim();
        if(name2.endsWith(lastName)){
            System.out.println("related");
        }else{
            System.out.println("not related");
        }
        System.out.println(name2.endsWith(lastName) ?"realted " : "not related");
    }
}
