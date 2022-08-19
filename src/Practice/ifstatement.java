package Practice;

public class ifstatement {
    public static void main(String[] args) {
        int number=30;

        String result="";

        if (number%2==0){
            result="Codility "; // +=  short cut of result=result+ == result+=

        }


        if (number%3==0){
            //Codility
            result=" Test ";
        }
        if (number%5==0){
            result = " Coders";
        }

        System.out.println(result);
    }
}
