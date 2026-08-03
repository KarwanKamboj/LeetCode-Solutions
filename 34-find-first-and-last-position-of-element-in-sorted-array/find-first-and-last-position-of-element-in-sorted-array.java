class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int ans[] = new int[2];
        ans[0] = leftSearch(nums,target);
        ans[1] = rightSearch(nums,target);
        return ans ;
    }
    private int leftSearch(int[] nums,int target){
        int low =0 ;
        int high = nums.length -1;
        int idx = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                idx = mid;
                high = mid-1;
            }else if(nums[mid]<target){
                low = mid + 1;
            }else{
                high = mid-1;
            }
        }
        return idx;
    }
    private int rightSearch(int[] nums,int target){
        int low =0 ;
        int high = nums.length -1;
        int idx = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                idx = mid;
                low = mid+1;
            }else if(nums[mid]<target){
                low = mid+1;                
            }else{
                high = mid -1;
            }
        }
        return idx;
    }
}