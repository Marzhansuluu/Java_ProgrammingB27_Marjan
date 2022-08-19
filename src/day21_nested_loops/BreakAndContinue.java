package day21_nested_loops;

public class BreakAndContinue {
    public static void main(String[] args) {
        for(char i ='A'; i <= 'E'; i++){
            System.out.println(i);// this print will print me A-E without break. Since I used break, it will print up to 'C' then checks the if condition.
            // if i wanted to stop at 'C'
            if(i == 'C'){
                break;
            }
        }
        System.out.println("-----------------------------------------------");

        for(int i = 1; i <= 5; i++){
            System.out.println(i);

            if(i == 3){
                break;
            }
        }
        System.out.println("------------------------------------------");
        for( char a = 'A'; a <= 'E'; a++){
            if(a == 'C'){
                //break; // if I put in here break, then it will print me A, B. I want to perint A-E and skip the C.
                continue;// it will print me A,B,D,E.

            }
            System.out.println(a);

        }
    }
}
