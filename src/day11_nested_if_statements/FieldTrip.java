package day11_nested_if_statements;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 6;
        String location = "";
        String teacher = "";
        int numberOfGroups = 0;

        if (grade > 0 && grade <= 6) { // valid grades
            if (grade == 1) {
                location = "Apple Orchid";
                teacher = "Ms.Smith";
                numberOfGroups = 5;
            } else if (grade == 2) {
                location = "Zoo";
                teacher = "Ms.Bond";
                numberOfGroups = 6;
            }else if(grade == 3){
                location = "Six Flags";
                teacher = "Ms.Simson";
                numberOfGroups = 5;
            } else if (grade == 4) {
                location = "Museum";
                teacher = "Ms.Kouchit";
                numberOfGroups = 6;
            }else if(grade == 5){
                location = "Movie Theater";
                teacher = "Ms.Jensen";
                numberOfGroups = 5;
            } else if (grade == 6) {
                location = "Disney";
                teacher = "Ms.Marjan";
                numberOfGroups = 6;
            }
            System.out.println("Grade: " + grade);
            System.out.println("Location: " + location);
            System.out.println("Teacher: " + teacher);
            System.out.println("Number of group: " + numberOfGroups);
        } else {
            System.out.println("Invalid grade");
        }
    }
}
