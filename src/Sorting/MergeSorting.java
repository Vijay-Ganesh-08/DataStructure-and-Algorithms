package src.Sorting;

/*
 * Like Quick Sort, it also applies Divide and Conquer.
 * It divides the list of elements based on median into multiple short lengthen elements.
 * Merges back into a bigger array with sorted elements by comparing the elements in the arrays.
 */

public class MergeSorting {

    public static void main(String[] args) {
        int[] nums = {30, 28, 26, 25, 23, 22, 21, 20, 18, 15, 10};
        int size = nums.length;
        int start = 0;
        int end = nums.length - 1;
        System.out.println("Before Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }

        mergeSort(nums,start,end);

        System.out.println("\nAfter Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }

    }

    private static void mergeSort(int[] nums, int start, int end) {
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(nums,start,mid);
            mergeSort(nums,mid+1,end);

            merge(nums, start,mid,end);
        }
    }

    private static void merge(int[] array, int start, int mid, int end) {

        int array1Size = mid - start + 1;
        int array2Size = end - mid;

        int[] tempLeft = new int[array1Size];
        int[] tempRight = new int[array2Size];

        for (int i = 0; i < array1Size; i++) {
            tempLeft[i] = array[start + i];
        }

        for (int i = 0; i < array2Size; i++) {
            tempRight[i] = array[mid + 1 + i];
        }

        int i = 0, j = 0, k = start;
        while (i < array1Size && j < array2Size) {
            if (tempLeft[i] <= tempRight[j]) {
                array[k] = tempLeft[i];
                i++;
            } else {
                array[k] = tempRight[j];
                j++;
            }
            k++;
        }
        while (i < array1Size) {
            array[k] = tempLeft[i];
            i++;
            k++;
        }
    }
}
