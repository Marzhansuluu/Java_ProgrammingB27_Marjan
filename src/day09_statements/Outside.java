package day09_statements;

public class Outside {
    public static void main(String[] args) {
        double degrees = 70;
        if(degrees >= 72){
            System.out.println(degrees + " F we can go outside.");
        }
        if(degrees <= 72){
            System.out.println(degrees + " F stay inside, code some Java.");
        }
        if(degrees >= 72){
            System.out.println(degrees + " F we can go outside.");
        }else {
            System.out.println(degrees + " F stay inside, code some Java.");
        }


    }
}
