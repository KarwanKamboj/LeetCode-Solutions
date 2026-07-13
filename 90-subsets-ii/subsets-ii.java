class Solution {
    private void fun(int idx,List<Integer> ans,List<List<Integer>>res,int[] nums){
        res.add(new ArrayList<>(ans));
        if(idx == nums.length) return;
        for(int i = idx ;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) continue ;
            ans.add(nums[i]);
            fun(i+1,ans,res,nums);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
        fun(0,ans,res,nums);
        return res;
    }
}