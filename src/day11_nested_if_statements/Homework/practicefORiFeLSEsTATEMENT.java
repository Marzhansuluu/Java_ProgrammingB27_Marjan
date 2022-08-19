package day11_nested_if_statements.Homework;

public class practicefORiFeLSEsTATEMENT {
    public static void main(String[] args) {
        int  a = 30;
        String result = "";  // result space


        if(a % 2 ==0)

        {
            result = "first";  //result --> first
        }

        else if (a % 3 == 0)

        {
            result = "second";
        }


        //result --> first


        if(a % 5 ==0)
        {
            result += "  third";   // result -> first third
            if (a % 15== 0){
                result   += "  fourth"; // result --> first third forth
            }
            if (a%10==0){
                result = result +  " fifth ";
            }
        }
        else {
            System.out.println(result + 1);
        }
        System.out.println(result);
    }
}
