class Solution {

    private void solve(int idx, String curr,
                       String digits,
                       List<String> ans,
                       String[] arr) {

        if (idx == digits.length()) {
            ans.add(curr);
            return;
        }

        String s = arr[digits.charAt(idx) - '0'];

        for (int i = 0; i < s.length(); i++) {
            solve(idx + 1, curr + s.charAt(i), digits, ans, arr);
        }
    }

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] arr = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        solve(0, "", digits, ans, arr);

        return ans;
    }
}