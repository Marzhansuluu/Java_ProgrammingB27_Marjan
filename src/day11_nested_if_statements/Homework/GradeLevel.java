package day11_nested_if_statements.Homework;

public class GradeLevel {
    public static void main(String[] args) {
        /*
        Create a class called GradeLevel, Given a number grade level
determine and print which school type someone is in.
grade level and types are:
any number less than 1 or more than 18 is not valid
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
         */
        int gradeLevel = 6;
        if(gradeLevel > 0 && gradeLevel < 19){
            if(gradeLevel >=1 && gradeLevel <= 5){
                System.out.println("Elementary school");
            }else if(gradeLevel >= 6 && gradeLevel <= 8){
                System.out.println("Middle school");
            }else if(gradeLevel >=9 && gradeLevel <=12){
                System.out.println("High school");
            }else if(gradeLevel >= 13 && gradeLevel <=16){
                System.out.println("College");
            }else if(gradeLevel == 17 || gradeLevel == 18){
                System.out.println("Grad School");
            }else{
                System.out.println("Not valid grade level");
            }
        }
    }
}
