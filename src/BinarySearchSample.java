package src;

/*
 * Binary Search is to split the array into 2 parts
 * Starting (s) and End (e) Poisition 
 * Mid Value is s+e/2 
 * Ex. Array of size 6, s = 0 and e = 6 and Mid Value is 3
 * Checking the value of the Array in Mid Index if its Greater/Lesser.
 * Based on that, you can avoid half the processing time.
 * Iterate the same splitting of Array again if the length is huge 
 * check the value and repeat the same.
 */

public class BinarySearchSample {

    public static void main(String[] args) {
        int i = 17;
        int[] nums = {1,3,5,6,8,9,10,12,15,16,17,19,20};
        BinarySearchAlg oBinarySearch = new BinarySearchAlg();
        int index = oBinarySearch.searchArray(nums,i);

        if (index == -1){
            System.out.println("Array Value Not found");
        } else {
            System.out.println("Found Array Value " + i + " in Index " + index);
        }
    }
    
}

class BinarySearchAlg {

     public int searchArray (int[] nums, int target){

        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
     }
}