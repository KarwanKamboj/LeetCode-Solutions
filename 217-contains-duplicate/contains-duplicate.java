class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int i : nums){
            if(mp.containsKey(i)) return true;
            mp.put(i,1);
        }
        return false ;
    }
}