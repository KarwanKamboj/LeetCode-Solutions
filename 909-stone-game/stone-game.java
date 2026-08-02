class Solution {
    Integer[][] dp;
    private int solve(int i, int j, int[] piles) {
        if (i == j)
            return piles[i];

        if (dp[i][j] != null)
            return dp[i][j];

        int left = piles[i] - solve(i + 1, j, piles);
        int right = piles[j] - solve(i, j - 1, piles);

        return dp[i][j] = Math.max(left, right);
    }
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        dp = new Integer[n][n];

        return solve(0, n - 1, piles) > 0;
    }
}