class Solution {
    public int maxSubArray(int[] nums) {
        int n  = nums.length;   //kdane's algo O(n)
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < n ;i++){  // subarray start
            sum = sum + nums[i];
            max  = Math.max(max,sum);
            if(sum <0){
                sum = 0;
            }
        }
        return max;
    }
}