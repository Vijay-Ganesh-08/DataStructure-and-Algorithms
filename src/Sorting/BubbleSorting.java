package src.Sorting;

/*
 * First iteration: Comparing the first 2 elements—if the first element is greater than the 2nd element, then swap them. This process repeats for the rest of the elements.
 * Second iteration: The last element can be skipped as it now has the highest value. The comparison continues as done in the 1st iteration.
 * The iterations continue until all elements are sorted.
 * Time Complexity is O(n²)—which means for each element, it takes approximately n steps to execute.
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
