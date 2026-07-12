class Solution {
    private void swap(int left,int right,int []nums){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp ;
        return ;
    }
    public void sortColors(int[] nums) {
        // three pointer
        int left = 0 ;
        int mid = 0;
        int right = nums.length -1 ;
        while(mid<= right){
            if(nums[mid] == 0){
                swap(mid,left,nums);
                left++;
                mid++;
            }
            else if( nums[mid] == 1){
                mid ++ ;
            }
            else{
                // nums[mid] == 2
                swap(mid,right,nums);
                right--;
            }
        }
    }
}