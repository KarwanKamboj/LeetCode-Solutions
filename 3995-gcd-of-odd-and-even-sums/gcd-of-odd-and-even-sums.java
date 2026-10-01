class Solution {// t = O(log(min(a,b))) , s = O(1)
    public int gcdOfOddEvenSums(int n) {
        int a=0,b =0;
        for(int i = 1 ; i<=n;i++){
            a +=2*i;    // even sum
            b +=2*i-1;  // odd sum 
        }
        while(b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        return a;
    }
}