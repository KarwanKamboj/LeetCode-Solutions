class Solution {
    //left == right, only one elemnt is left that must be minimum
    public int findMin(int[] nums) {
        int left= 0;
        int right = nums.length-1;
        int ans =-1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(nums[mid]>nums[right]){
                left = mid +1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}