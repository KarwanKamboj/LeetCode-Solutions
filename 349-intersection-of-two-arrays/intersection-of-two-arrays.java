class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      HashSet<Integer> set = new HashSet<>();
      for(int n : nums1){
        set.add(n);
      }
      ArrayList<Integer> lst = new ArrayList<>();
      for(int n : nums2){
        if(set.contains(n)){
            lst.add(n);
            set.remove(n);
        }
      }
        int res[] = new int[lst.size()];
        for(int i = 0 ;i < lst.size();i++){
            res[i] = lst.get(i);
        }
        return res;
    }
}