class Solution {
    public int largestInteger(int[] nums, int k) {
        int ans=-1;
        int n = nums.length;
        for(int nm : nums){
            int count = 0;
            for(int i = 0 ;i<=n-k;i++){
                for(int j=i;j<i+k;j++){
                    if(nums[j]==nm){
                        count++;
                        break;
                    }
                }
            }
            if(count==1){
                ans=Math.max(ans,nm);
            }
        }
        return ans;
    }
}