class Solution { // we only need to check num == mid*mid , no need of roundoff to nearest integer 
    public boolean isPerfectSquare(int num) {
        if(num == 0 || num ==1) return true;
        int left =1;
        int right = num; 
        int ans = 0; 
        while(left<=right){
            int mid = left + (right-left)/2 ;
            long sq = (long) mid * mid ;
            if(num == sq) return true;
            else if(num<sq){
                right = mid -1;
            }else{
                left = mid +1 ;
            }           
        }
        return false;
    }
}