package day36_custom_classes.hobby;

import java.util.ArrayList;

public class Hobby {
    /*
    create a class called Hobby

        - data:

            name, annual cost, is outdoors (boolean), requires others (boolean)
*/
    String name;
    double annualCost;
    boolean isOutdoor;
    boolean requiresOthers;

    //CONSTRUCTORS

    //- create a constructor that creates a Hobby object with the name
    public Hobby(String name) {
        this.name = name;
    }
    // - create a constructor that creates a Hobby object with the name and annual cost
    // - create a constructor that creates a Hobby object with the name, annual cost, is outdoors, and requires others
    public Hobby(String name, double annualCost){
        this(name);
        this.annualCost = annualCost;
    }
    public Hobby(String name, double annualCost, boolean isOutdoor){
        this(name, annualCost);
        this.isOutdoor = isOutdoor;
        doIt();
    }
    /*
        - method:
            - doIt():
                print: Doing $name-of-hobby $outside-or-inside
                    ex: new Hobby("golf", 100, true, false).doIt() -> Doing golf outside
                    ex: new Hobby("puzzles", 50, false, true).doIt() -> Doing puzzles inside
     */
    public void doIt(){
        System.out.println("Doing " + name + "\nIs it outdoor hobby? " + isOutdoor);
    }
    /*
            - toString()
                print all the Hobby information
*/

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoor=" + isOutdoor +
                ", requiresOthers=" + requiresOthers +
                '}';
    }

}
