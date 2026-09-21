class Solution {
    public int majorityElement(int[] nums) {
        // Boyr Moore Majority voting algorithm , t = O(n), S = O(1)
        int count = 0;
        int candidate = 0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
               candidate = nums[i];
            }
            if(nums[i]==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}