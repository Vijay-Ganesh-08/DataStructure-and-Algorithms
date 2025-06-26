package src.Sorting;

/*
 * Unlike Bubble sort, selection sort doesn’t swap elements for each iteration.
 * Selecting the minimum value from the list and swapping it to the front.
 * No. of swapping is reduced as its done in the outer loop.
 * Time Complexity is O(n²)—which means for each element, it takes approximately n steps to execute, but considered be to better as we are swapping in the outer loop
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
