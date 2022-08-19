package my_utils;

public class ArrayUtil {
    public static int min (int ... arr){// int [] arr IS THE SAME AS in ...arr
        /*
    Min number
    create a method that will accept an int array and return the smallest number from the array
     */
        int min = arr[0];

        for(int each: arr){
            if(each < min){
                min = each;
            }
        }
        return min;
    }

    public static int max(int ... arr) {// int [] arr IS THE SAME AS in ...arr
        /*
            Max number: create a method that will accept an int array and return the biggest number from the array
         */
        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static boolean contains(int [] arr, int num){
        /*
    Contains
    create a method that will accept an int array and an int number. Check and return if the given number is in the array

     */
        for(int each :arr){
            if(each ==num){
                return true;
            }
        }
        return false;
    }

    public static int indexOf(int [] arr, int num){// if you wanted to use var args: public static int intdexOf(int num, int ...arr){}
        /*
    IndexOf()
    create a method that will accept an int array int number. Find the return if the index of the number in the array. If there is multiple occurrence return the first occurrence's index
     */
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == num){
                return i;
            }
        }


        return -1;
    }


    public static int indexOf(int [] arr, int target, int startIndex){
        for(int i = startIndex; i < arr.length; i ++){
            if(arr[i] == target){
                return i;
            }
        }


        return -1;
    }

    public static String [] addElement(String[] arr, String element) {
    /*
    Add element
    create a method that will accept a String array and String element. Add the given element value, into the end of the array. Do not replace the last index of the given array, but instead create a new array with a bigger size to for all the original elements plus the new one.
     */
        String [] newArr = new String[arr.length +1];// create an array with an extra size
        for(int i =0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[newArr.length -1]= element; // add the new element to the end of the new array
        return newArr;
    }
    public static String  [] addElement(String [] originals, String[] other) {

    /*
    add elemnts
    overload the add element method to accept two String arrays. For this one add all the given elements from the second array in the first array.
    Ex{"today", "is", "monday"},
    {"no", "softskill", "today"}
    output--> [today, is, monday, no, softskills, today]
     */

        String[] merged = new String[originals.length + other.length];

        for(int i =0; i < originals.length; i++){// copy the elements from the original array into the new array
            merged[i] = originals[i];//[today, is, monday, no, softskills, today]
        }
        for(int i = 0; i < other.length; i++){// read the elements from the other array and store them into the merged array
            merged[originals.length +i] = other[i];// other's [0] index ==no, other[1]==monday, other[2] = today. original.length +i---> original length = 3(today, is , monday) +i(because we are starting 0 index of other array.
        }
        return merged;
    }

    public static int wordCount(String words) {
        // your code
        int count =0;
        String [] arr = words.split(" ");
        for(int i =0; i < arr.length; i++){
            count++;
        }
        return count;
    }


}
