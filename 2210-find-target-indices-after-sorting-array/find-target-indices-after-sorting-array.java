class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count=0;
        int freq=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                count++;
            }
            if(nums[i]==target){
                freq++;
            }
        }
        List<Integer>ans=new ArrayList<>();
        while(freq>0){
            ans.add(count);
            count++;
            freq--;
        }
        return ans;
    }
}