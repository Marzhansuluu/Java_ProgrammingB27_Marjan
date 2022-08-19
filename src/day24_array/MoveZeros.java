package day24_array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        /*
        Move Zeros

	Write a program that will move all the zero numbers to the end of the array. The rest of the numbers will move over in position

Hint: You don’t have to manipulate the given array, try to use another array too. Think about the indexes

	Ex:
	Input:
		[10, 0, 5, 0, 1, 0]
	Output:
		[10, 5, 1, 0, 0, 0]
         */

        int [] nums = {10, 0, 5, 0, 1, 0};
        //     fixed = {10, 5, 1,
        int []fixed = new int[nums.length];// [0,0,0,0,0,0]
        int indexToRead = 0;// read every index element from beginning to end --> same as i in traditional loop
        int indexToStore = 0;// store values into the fixed array, maybe will not increment each time


        //indexToRead:0
        //indexToStore: 0
        while(indexToRead < nums.length){// our first iteration indexToRead 0 < nums(6) TRUE
            if(nums[indexToRead] != 0){// indexToRead 0 ;false yani her bir index number zero'ya equal olmadigi surece onlari basa kaydettik.
                fixed[indexToStore]= nums[indexToRead];//1)true indexToStore[0]=10(indexToRead[0]);,  2)false indexToStore[1]=0(indexToRead[1]); 3)true indexToStore [1]= 5 indexToRead[2], 4)false indexToStore[2] = 0 indexToRead[3], 5)indexToStore[2] = 1 indexToRead[4], 6)indexToStore = 0 indexToRead[5],
                indexToStore++;
            }
            indexToRead++;
        }
        System.out.println(Arrays.toString(fixed));
    }
}
