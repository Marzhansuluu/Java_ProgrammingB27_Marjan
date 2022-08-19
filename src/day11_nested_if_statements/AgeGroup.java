package day11_nested_if_statements;

public class AgeGroup {
    public static void main(String[] args) {

        /*
        age should be between 0-120;
        <1 baby
        2-5 toddler
        6-13 kids
        14-18 young adult
        19-40 adult
        41-65 middle age
        >65 senior
         */
        int age = 50;
        if (age >= 0 && age <= 120) { // precondition to check for valid ages only
            if (age <= 1) {
                System.out.println("Baby");
            } else if (age <= 5) {// we can also write (age>= 2 && age <= 5)
                System.out.println(age + "toddler");
            } else if (age <= 13) {
                System.out.println("Kid");
            } else if (age <= 18) {
                System.out.println("Teenager");
            } else if (age <= 40) {
                System.out.println("Adult");
            } else if (age <= 65) {
                System.out.println("Middle aged Adult");
            } else {// if i am here, the age is between 66-120.
                System.out.println("Senior");
            }
        } else { // invalid age
            if(age < 0){
                System.out.println("Ages cannot be negative");
            }else{
                System.out.println("Ages cannot be more than 120");
            }

        }
    }
}
