class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        String s = "123456789";   // sliding window on string
        List<Integer> ans = new ArrayList<>();

        for (int len = 2; len <= 9; len++) {

            for (int i = 0; i + len <= 9; i++) {

                int num = Integer.parseInt(s.substring(i, i + len));

                if (num >= low && num <= high)
                    ans.add(num);
            }
        }

        return ans;
    }
}