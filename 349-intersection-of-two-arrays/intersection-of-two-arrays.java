class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>st = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            st.add(nums1[i]);
        }
        Set<Integer>set = new HashSet<>();
        for(int i =0 ;i <nums2.length;i++){
            if(st.contains(nums2[i])){
                set.add(nums2[i]);
            }
        }
        int[] res =new int[set.size()];
        Iterator<Integer> it = set.iterator();

        int i =0;
        while (it.hasNext()) {
            res[i++] = it.next();
        }
        return res;
    }
}