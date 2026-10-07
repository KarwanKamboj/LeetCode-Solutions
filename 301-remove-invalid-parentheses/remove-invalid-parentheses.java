class Solution {

    public List<String> removeInvalidParentheses(String s) {
        int n = s.length();
        int open = 0;   // unmatched '(' seen so far
        int min = 0;    // minimum removals needed

        // Step 1: count how many parentheses MUST be removed
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c != '(' && c != ')') continue;   // letters don't matter

            if (c == '(') open++;
            else open--;

            // a ')' with no '(' to match -> must be removed
            if (open < 0) {
                min += Math.abs(open);
                open = 0;
            }
        }
        min += open;   // leftover '(' with no ')' -> must be removed

        // Step 2: try every way of removing exactly 'min' parentheses
        Set<String> result = new HashSet<>();   // set removes duplicates
        helper(0, min, 0, s, new StringBuilder(), result);

        return new ArrayList<>(result);
    }

    // idx  -> current position in s
    // min  -> removals still left
    // open -> balance of the string built so far ('(' count minus ')' count)
    public void helper(int idx, int min, int open, String s, StringBuilder sb, Set<String> result) {
        // more ')' than '(' in the prefix -> can never become valid
        if (open < 0) return;

        if (idx == s.length()) {
            // valid only if balanced AND exactly 'min' removals were used
            if (open != 0 || min > 0) return;
            result.add(sb.toString());
            return;
        }

        char c = s.charAt(idx);
        int add = 0;
        if (c == '(') add = 1;
        else if (c == ')') add = -1;

        // Choice 1: KEEP the current character
        sb.append(c);
        helper(idx + 1, min, open + add, s, sb, result);
        sb.deleteCharAt(sb.length() - 1);   // backtrack

        // letters can never be removed
        if (c != '(' && c != ')') return;

        // Choice 2: REMOVE the current parenthesis (only if removals are left)
        if (min != 0) helper(idx + 1, min - 1, open, s, sb, result);
    }
}