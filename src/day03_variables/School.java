package day03_variables;

public class School {
    public static void main(String[] args) {
        int grade1=28; // we can declare int grade1=20, grade2=10, grade3=2, grade4=1, grade5=2;
        int grade2=20;
        int grade3=10;
        int grade4=15;
        int grade5=11;
        int total = grade1 + grade2 + grade3 + grade4 + grade5;
        System.out.println("Total number of students : \t" + total);
        double averageGpa=3.86;
        double schoolDays=11.5;
        double snowDays=10.5;
        System.out.println("Average GPA: \t\t\t\t" + averageGpa);
        System.out.println("Number of school days: \t\t" + schoolDays);
        System.out.println("Number of snow days:\t\t" + snowDays);
    }
}
/*Add a new class School
add main method
declare and assign all these variables:
    (all int) grade1, grade2, grade3, grade4, grade5
    assign the number of students in each grade
    extra: try to create another variable to find the total number of students in the whole school
    (all double) average gpa, number of school days, number of snow days

 */
