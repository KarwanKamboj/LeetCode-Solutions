class Solution {// t = O(n), s = O(1)
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int n = nums.length;
       
        for(int i = 1;i<n;i++){
            if(nums[i]<0){
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            maxProduct = Math.max(nums[i],nums[i]*maxProduct);
            minProduct = Math.min(nums[i],nums[i]*minProduct);

            max = Math.max(max,maxProduct);
        }
        return max ;
    }
}