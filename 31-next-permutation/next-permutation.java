import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {  // suffix +  sort method
        int n = nums.length;

        // Find pivot
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Find smallest greater element
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Sort suffix
        Arrays.sort(nums, i + 1, n);
    }
}