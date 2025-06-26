package src.Sorting;

/*
 * First iteration : Finding the minimum value and swapping it to the front
 * Second Iteration : skipping the 1st element and checking the minimum value and swapping it to the front
 * The iteration goes on until all the elements are sorted.
 * Time Complexity is O(n^2) - which means, for every elements it takes twice the steps to execute
 */
public class SelectionSorting {
    public static void main(String[] args) {


        int[] nums = {20, 18, 15, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;
        System.out.println("Before Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }

        for (int i = 0; i < size-1; i++) {
//      or    for (int i = 0; i < size; i++) { --> 1 iteration increased
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
            System.out.println();
            System.out.println("Sorting Iteration : " + i);
            for (int n : nums) {
                System.out.print(n + " ");
            }
        }

        System.out.println("\nAfter Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
