package day19_for_loops;

import java.util.Scanner;

public class do_while_loop_Color {
    /*
    write a program that will allow the user to select three colors for the painting. There needs to be 3 unique colors selected
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfColor = 0;// we initially put 0.
        String colors = "";// if we want to declare the string variable, we won't get the 3 unique color.
        while(numOfColor < 3){// in here we set the num of color to max 3.
            System.out.println("Enter the next color");
            String inputColor = input.nextLine().toLowerCase();

            if(!colors.contains(inputColor)){// if the color is unique, color String does not have the value already. if my color does not contain my input color, it will ask forever to put unique color.
                colors +=" " + inputColor; // we added to our string in that way we won't have duplicate colors.
                numOfColor++;// we do have another color

            }
        }
        System.out.println("You chose these color: " + colors);

    }
}
