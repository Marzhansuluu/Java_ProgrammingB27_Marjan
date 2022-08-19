package day11_nested_if_statements;

public class NestedExample {
    public static void main(String[] args) {
        boolean a = true; // false: when the first statement is wrong the second is will not run. because the second is inside of the first statement.
        boolean b = true;// false: when is reverse a is true b is false then it will run and the main if will give an output 1.


        if(a){
            System.out.println(1);// when a=true and b=true output comes 1 and 2.

            if(b){
                System.out.println(2);
            }
        }


    }
}
