class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int sumEven = 0 ;
        int sumOdd = 0;
       
        for (int i = 1; i <= n; i++) {
            sumOdd += (2 * i - 1);   // 1, 3, 5, ...
            sumEven += (2 * i);      // 2, 4, 6, ...
        }
       return gcd(sumEven,sumOdd);
    }
}