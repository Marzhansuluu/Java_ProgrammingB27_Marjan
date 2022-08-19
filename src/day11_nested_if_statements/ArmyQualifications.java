package day11_nested_if_statements;

public class ArmyQualifications {
    public static void main(String[] args) {
        /*
        ages 18-35
        high school diploma
        citizen
         */
        int age = 36;
        boolean hasDiploma = false;
        boolean isCitizen = true;

        if((age >= 18 && age <= 35) && hasDiploma && isCitizen){
            System.out.println("You qualify for the army");
        }else{ // these folowing multi branch is to give information about the age
            if(age < 0 || age > 120){
                System.out.println("Not a valid age number");
            }else if(age < 18){
                System.out.println("You are too young, need to be at least 18");
            }else if (age >35){
                System.out.println("You are too old, limit is 35 years old");
            }
            if(!hasDiploma){ // if to check about diploma
                System.out.println("You need at least a high school diploma");
            }
            if(!isCitizen){ // if to check citizenship
                System.out.println("You need to be a citizen to apply");
            }
        }
    }
}
