class Solution {
    public int splitArray(int[] nums, int k) {
        int left=0;
        int right=0;
        for(int n:nums){
            if(n>left){
                left=n;
            }
            right+=n;
        }
        while(left<=right){
            int mid = left + (right-left)/2;
            int count = 1;
            int sum = 0;
            for(int n:nums){
                if(sum+n>mid){
                    count++;
                    sum=0;
                }
                sum+=n;
            }
            if(count<=k){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}