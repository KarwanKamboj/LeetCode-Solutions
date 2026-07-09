class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            int rightSum = 0;

            for (int j = i + 1; j < n; j++) {
                rightSum += nums[j];
            }

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}