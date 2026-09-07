class Solution {
    public int distinctSubseqII(String s) {
        long[] dp = new long[26];
        long total = 0, mod = 1_000_000_007;
        for (char c : s.toCharArray()) {
            int i = c - 'a';
            long add = (total + 1) % mod;
            total = (total + add - dp[i] + mod) % mod;
            dp[i] = add;
        }
        return (int) total;
    }
}