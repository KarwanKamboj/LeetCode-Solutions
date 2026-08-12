class Solution {// T= O(N), S = O(N),sliding window + two pointer
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer>mp= new HashMap<>();
        int left = 0 ;
        int maxLen = 0;
        for(int right=0;right<n;right++){
            mp.put(nums[right],mp.getOrDefault(nums[right],0)+1);
            while(mp.get(nums[right])>k){ //can't use if here
                mp.put(nums[left],mp.get(nums[left])-1);
                left++;
            }
            int len = right-left+1;
            maxLen = Math.max(maxLen,len);
        }
        return maxLen;
    }
}