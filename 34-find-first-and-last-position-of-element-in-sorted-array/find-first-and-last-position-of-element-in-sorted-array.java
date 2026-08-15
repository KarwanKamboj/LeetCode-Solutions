class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left  = 0;
        int right  = nums.length-1;
        int ans[] = {-1,-1};
        ans[0] = leftSearch(left,right,nums,target);
        ans[1] = rightSearch(left,right,nums,target);
        return ans;
    }
    private int leftSearch(int left, int right,int[] nums,int target){
        int ans = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                ans = mid;
                right = mid -1;  // to search left most
            }else if(nums[mid]<target){
                left = mid + 1;   
            }
            else{
                right = mid - 1;
            }
        }
        return ans;
    }
    private int rightSearch(int left, int right, int nums[], int target){
        int ans = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                ans = mid;
                left = mid + 1; // to search rightmost
            }else if(nums[mid]<target){
                left = mid + 1;   
            }
            else{
                right = mid - 1;
            }
        }
        return ans;
    }
}