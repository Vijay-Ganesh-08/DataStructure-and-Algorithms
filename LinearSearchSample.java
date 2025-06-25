/*
 * Linear Search is a process of iterating through each element of an Array
 * To check for value or process and compare the same
 * if the target value is at index 0, it is fast.
 * Iterating through the Sorted Arrays to find a value of an Array, 
 * based on the no. of elements the iteration steps takes longer time.
 */

public class LinearSearchSample{
    public static void main(String[] args) {
        int i = 20;
        int[] nums = {1,3,5,6,8,9,10,12,15,16,17,19,20};

        LinearSearchAlg oLinearSearch = new LinearSearchAlg();
        int index = oLinearSearch.searchArray(nums,i);
        if (index == -1){
            System.out.println("Array Value Not found");
        } else {
            System.out.println("Found Array Value " + i + " in Index " + index);
        }
    }
}

class LinearSearchAlg {
    public int searchArray (int[] nums, int target){
        int size = nums.length;
        for(int i=0;i<size;i++){
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}