class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int p[] = new int[n];
        int s[] = new int[n];

        int leftSum = 0;
        p[0] = 0 ;
        for(int i = 1 ; i < n ;i++ ){
            leftSum += nums[i-1];
            p[i] = leftSum ;
        }

        int rightSum = 0;
        s[n-1] = 0 ;
        for(int i = n-2 ; i >= 0 ;i-- ){
            rightSum += nums[i+1];
            s[i] = rightSum ;
        }
        for(int k = 0 ; k < n ; k++){
            if(p[k] == s[k]) return k;
        }
        return -1;
    }
}