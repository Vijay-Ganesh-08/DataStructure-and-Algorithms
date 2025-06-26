package src.Sorting;

/*
 * First iteration : Comparing the first 2 elements, if first element is greater than 2nd element then swap, and same repeats for the rest of the elements.
 * Second Iteration : the last element can be skipped as it has the highest value and the comparison continues as done in 1st iteration.
 * The iteration goes on until all the elements are sorted.
 * Time Complexity is O(n^2) - which means, for every elements it takes twice the steps to execute
 */
public class BubbleSorting {

    public static void main(String[] args) {

        int[] nums = {9,8,7,6,5,4,3,2,1};
        int size = nums.length;
        int temp = 0;
        System.out.println("Before Sorting");
        for(int n : nums){
            System.out.print(n + " ");
        }

        for(int i=0; i<size; i++){
            for(int j=0; j<size-i-1; j++){
//       or         for(int j=0; j<size-1; j++){
                    if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.println();
            System.out.println("Sorting Iteration : " + i);
            for(int n : nums){
                System.out.print(n + " ");
            }
        }

        System.out.println("\nAfter Sorting");
        for(int n : nums){
            System.out.print(n + " ");
        }
    }
}
