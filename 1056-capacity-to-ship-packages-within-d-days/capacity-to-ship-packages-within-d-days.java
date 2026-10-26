class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for(int w:weights){
            if(w>left){
                left=w;
            }
            right+=w;
        }
        while(left<=right){
            int mid =left+(right-left)/2;
            int d=1;
            int sum = 0;
            for(int w:weights){
                if(sum+w>mid){
                    d++;
                    sum=0;
                }
                sum+=w;
            }
            if(d<=days){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}