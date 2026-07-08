class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         HashMap<Integer,Integer>mp = new HashMap<>();
        for(int i = 0 ;  i < nums1.length ; i++){
            mp.put(nums1[i],mp.getOrDefault(nums1[i],0)+1);
        }
        List<Integer> lst = new ArrayList<>();
        for(int i = 0 ;i< nums2.length;i++){
            if(mp.containsKey(nums2[i])){
                lst.add(nums2[i]);
                mp.put(nums2[i],mp.get(nums2[i]) -1);
            
            if(mp.get(nums2[i]) == 0){
                mp.remove(nums2[i]) ;
            }
            }
        }
        int[] ans = new int[lst.size()];

        for(int i = 0; i < lst.size(); i++){
            ans[i] = lst.get(i);
        }
        return ans;
    }
}