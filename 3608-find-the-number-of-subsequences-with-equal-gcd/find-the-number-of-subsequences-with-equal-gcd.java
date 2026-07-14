class Solution {
    int mod;
    public int subsequencePairCount(int[] arr) {
        mod=1000000007;
        int n=arr.length;
        int max=-1; //maximum possible gcd can be max element in arr
        for(int ele:arr){
            max=Math.max(max,ele);
        }
        Integer [][][] dp=new Integer[n][max+1][max+1];
        return check(dp,0,0,0,arr);
    }
    public int check(Integer [][][] dp,int i,int gcda,int gcdb,int [] arr){
        if(i==arr.length){
            return (gcda != 0 && gcdb != 0 && gcda == gcdb)?1:0;
        }
        if(dp[i][gcda][gcdb]!=null)return dp[i][gcda][gcdb];
        int takeA=check(dp,i+1,gcd(gcda,arr[i]),gcdb,arr);
        int takeB=check(dp,i+1,gcda,gcd(gcdb,arr[i]),arr);
        int notTake=check(dp,i+1,gcda,gcdb,arr);
    return dp[i][gcda][gcdb]=(int)((1L*takeA+takeB+notTake)%mod);
    }
    public int gcd(int a,int b){
       while(b!=0){
          int temp=b;
          b=a%b;
          a=temp;
       }   
    return a;}
}