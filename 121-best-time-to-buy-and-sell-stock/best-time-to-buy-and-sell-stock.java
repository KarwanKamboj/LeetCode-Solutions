class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int n = prices.length;
        int buy  = Integer.MAX_VALUE;
        for(int i = 0 ; i<n;i++){
           if(prices[i] < buy){
            buy = prices[i];
           }
            max = Math.max(max,prices[i]-buy); // max profit
        }
        return max;
    }
}