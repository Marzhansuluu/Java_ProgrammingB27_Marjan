package day11_nested_if_statements;

public class RetakeQuiz {
    public static void main(String[] args) {
        double grade = 75;
        int attemptNumber = 1;
        double finalGrade = 0;
        if(attemptNumber == 1){
            finalGrade = grade *0.9; // 90% of grade, which is minus 10%;
        }else if(attemptNumber == 2){
            finalGrade = grade * 0.8; // 80% of grade, which is minus 20%
        }else if(attemptNumber ==3){
            finalGrade = grade * 0.65; // 65% of grade, which is minus 35%
        }
        System.out.println(finalGrade);


    }



}
