package src;

public class BinarySearchRecursive {

    public static void main(String[] args) {
        int i = 27;
        int[] nums = {10, 12, 15, 16, 17, 19, 20, 22, 25, 27, 29, 31};
        int start = 0;
        int end = nums.length - 1;

        int index = searchArray(nums, i, start, end);

        if (index == -1) {
            System.out.println("Array Value Not found");
        } else {
            System.out.println("Found Array Value " + i + " in Index " + index);
        }
    }

    public static int searchArray(int[] nums, int target, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return searchArray(nums, target, mid+1, end);
            } else {
                return searchArray(nums, target, start, mid-1);
            }
        }
        return -1;
    }

}