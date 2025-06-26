package src.Sorting;

/*
 * Unlike Selection/Insertion iterating through the entire list of array, quick sorts divides the array into multiple sub problems and merge at the end.
 * It uses Divide and Conquer, Recursion programming, pivot methodology and tree to achieve.
 * Time complexity is O(log n) but worst case it goes to O(n²).
 * Dividing the array is with the help of Pivot, it should be in the right.
 * and Recursive technique its validated and swapped accordingly
 */

public class QuickSorting {

    public static void main(String[] args) {
        int[] nums = {40, 37, 35, 33, 24, 30, 28, 26, 25, 23, 22, 21, 20};
        int start = 0;
        int end = nums.length - 1;
        System.out.println("Before Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }

        quicksort(nums, start, end);

        System.out.println("\nAfter Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }

    public static void quicksort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);
            quicksort(array, start, pivot - 1);
            quicksort(array, pivot + 1, end);

        }
    }

    public static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;

        System.out.println();
        System.out.println("Pivot: " + pivot);
        System.out.println("Sorting Iteration :");
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();

        return i + 1;

    }
}
