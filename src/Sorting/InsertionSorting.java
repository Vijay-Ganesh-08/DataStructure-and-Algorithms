package src.Sorting;

/*
 * Picks each element and shifting to the right position.
 * if the element is lesser that the first element, insert the current record to first position and shift the other elements to the right.
 * Assuming the first value is sorted, iteration starts from 2nd element and compare with first element.
 * for each iteration its, compared to the next position and the first element.
 */

public class InsertionSorting {
    public static void main(String[] args) {

        int[] nums = {30, 28, 26, 25, 23, 22, 21, 20, 18, 15, 10};
        int size = nums.length;

        System.out.println("Before Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }

        for(int i = 1; i < size; i++){
            int j = i - 1;
            int key = nums[i];
            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
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
