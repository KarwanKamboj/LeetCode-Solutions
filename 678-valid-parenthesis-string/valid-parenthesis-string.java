class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> op = new Stack<>(); // stack for '('
        Stack<Integer> st = new Stack<>(); // stack for '*'

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                op.push(i);
            } 
            else if (ch == '*') {
                st.push(i);
            } 
            else { // ch == ')'
                if (!op.isEmpty()) {
                    op.pop();
                } else if (!st.isEmpty()) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        // Match remaining '(' with '*'
        while (!op.isEmpty()) {
            if (st.isEmpty()) return false;

            // '(' must come before '*'
            if (op.peek() > st.peek()) return false;

            op.pop();
            st.pop();
        }

        return true;
    }
}