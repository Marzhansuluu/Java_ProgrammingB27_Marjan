package day10_if_else_elseIf_statements.homework;

public class Retake {
    public static void main(String[] args) {
        int grade = 65;
        int attempt = 1;
        double finalGrade= 0;

        if(attempt == 1){
            finalGrade = grade -(grade * 0.1); // 90% of grade, which is minus 10%; we can write also see the below equation.
        }else if(attempt == 2){
            finalGrade = grade * 0.8; // 80% of grade, which is minus 20%
        }else if(attempt ==3){
            finalGrade = grade * 0.65; // 65% of grade, which is minus 35%
        }
        System.out.println(finalGrade);


        /*
        create a class Retake
declare and assign a grade variable
declare and assign an attempt number
Doing a retake for the assignment will reduce the grade by a percentage
based on the number of attempts taken:
If its the first attempt -> subtract 10%
If its the second attempt -> subtract 20%
If its the third attempt -> subtract 35%
         */
    }
}
