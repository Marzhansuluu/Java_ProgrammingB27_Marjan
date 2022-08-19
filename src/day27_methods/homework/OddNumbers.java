package day27_methods.homework;

public class OddNumbers {
    /*
    create a method that can print odd numbers between 1-100 in the
same line separated by space

create a method that can print even numbers between 1-100 in the
same line separated by space
     */
        public static void odd(){
            for(int i = 1; i <= 100; i++){// i=1, i=3, i=5,
                if(i % 2 == 1){
                    System.out.print(i + " ");
                }
            }

        }
        public static void even(){
            for(int  i = 1; i <= 100; i++){
                if(i % 2 ==0){
                    System.out.print(i + " ");
                }
            }
        }
        public static void space(){
            System.out.println();
        }

    public static void main(String[] args) {
        odd();
        space();
        space();
        even();
    }

}
