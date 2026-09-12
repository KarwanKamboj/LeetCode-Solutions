class Solution {// t = O(nlogn), s = O(1), using sorting
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while(n>0){
            nums1[m] = nums2[--n];
            m++;
        }
        Arrays.sort(nums1);
    }
}