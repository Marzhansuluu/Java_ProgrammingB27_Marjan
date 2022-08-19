package day23_array;

public class EvenOdd {
    public static void main(String[] args) {

        int [] nums = {2, 5, 6, 3, 5, 653, 5, 3, 56};

        int even =0, odd =0;

        for(int each : nums){
            if(each % 2 ==0){
                even++;// print(each + " is even"
            }else{
                odd++; // print(each + " is odd"
            }
        }


        // TRADITIONAL WAY FOR LOOP
        /*
         for(int i =0; i <nums.length; i++){
            if(nums[i] %2 ==0){
                even++;// print(each + " is even"
            }else{
                odd++; // print(each + " is odd"
            }
        }
         */

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
