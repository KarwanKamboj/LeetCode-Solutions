class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int p:piles){
            if(p>right){
                right=p;
            }
        }
        while(left<=right){
            int mid =  left + (right-left)/2;
            long hours = 0;
            for(int p:piles){
            hours += (p+(long)mid-1)/mid;
            }
            if(hours<=h){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
}