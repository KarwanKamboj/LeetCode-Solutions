class Solution {//O(log n)
    public int mySqrt(int x) {
        if(x<=1) return x;

        int left = 1;
        int right = x;
        int ans  = 0;
        while(left<=right){
            int mid = left + (right-left)/2 ;
            long sq = (long)mid*mid;
            if(x==sq){
                return mid;
            }
            else if(x<sq){  
                right = mid-1;       
            }else{
                ans = mid;
                left = mid+1;
            }
        }
        return ans;
    }
}