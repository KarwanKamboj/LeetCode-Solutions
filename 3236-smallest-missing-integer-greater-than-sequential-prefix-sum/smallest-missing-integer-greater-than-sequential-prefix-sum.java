class Solution {
    public int missingInteger(int[] A) {
        int sum = A[0];
        boolean[] seen = new boolean[52];
        boolean seq = true;

        seen[A[0]] = true;

        for (int i = 1; i < A.length; i++) {
            if (seq && A[i] == A[i - 1] + 1)
                sum += A[i];
            else {
                seq = false;
                if (sum > 50)
                    return sum;
            }
            seen[A[i]] = true;
        }

        for (int i = sum; i < 52; i++)
            if (!seen[i])
                return i;

        return sum;
    }
}