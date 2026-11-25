class Solution {
    boolean isValid(int[] nums, int k) {
        int n = nums.length;
        int l = 0, r = 0;

        HashMap<Long, Integer> mp = new HashMap<>();

        long mod = 1000000007;
        long base = 100001;
        long p = 1;
        long hash = 0;

        // Calculate base^(k-1)
        for (int i = 0; i < k - 1; i++) {
            p = (p * base) % mod;
        }

        // Sliding Window + Rolling Hash
        while (r < n) {

            // Add incoming element
            hash = (hash * base + nums[r]) % mod;

            if (r - l + 1 == k) {

                // Store frequency of current hash
                mp.put(hash, mp.getOrDefault(hash, 0) + 1);

                // Remove outgoing element
                hash = (hash - nums[l] * p % mod + mod) % mod;

                l++;
            }
            r++;
        }

        // Check whether a unique subarray exists
        for (int e : mp.values()) {
            if (e == 1) return true;
        }

        return false;
    }

    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;
        int l = 1;
        int h = n;
        int ans = n;

        // Binary Search on Answer
        while (l <= h) {
            int m = l + (h - l) / 2;

            if (isValid(nums, m)) {
                h = m - 1;
                ans = m;
            } else {
                l = m + 1;
            }
        }

        return ans;
    }
}