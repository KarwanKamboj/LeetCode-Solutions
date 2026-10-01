class Solution {
    public int gcdOfOddEvenSums(int n) {
        int count = 0;
        int i =1;
        int odd=0,even = 0;
        int a=0,b = 0;
        while(odd!=n&&even!=n){
            if(i%2!=0){
                a+=i;
                odd++;
            }else{
                b+=i;
                even++;
            }
            i++;
        }
        while(b!=0){
            int  rem = a%b;
            a = b;
            b = rem;
        }
        return a;
    }
}