class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] p = new int[n];
        int[] s = new int[n];

        int product = 1;
        for(int i = 0 ; i<n;i++){
            p[i] = product;
            product = nums[i] * p[i];
        }
        product = 1;
        for(int i= n-1; i>=0;i--){
            s[i] = product;
            product = nums[i]*s[i];
        }
        int[] res = new int[n];
        for(int i = 0 ;i<n;i++){
            res[i] = p[i]*s[i];
        }
        return res;
    }
}