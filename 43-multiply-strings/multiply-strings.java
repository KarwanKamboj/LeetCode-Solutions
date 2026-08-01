class Solution {
    // same approach as done on notebook
    // t = O(m*n), s = O(m+n)
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        int m = num1.length();
        int n = num2.length();
        int res[] = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int left = i + j;
                int right = i + j + 1;
                
                int sum = mul+res[right];
                res[right] = sum % 10; // store digit
                res[left] = res[left]+ sum / 10; // store carry
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int x : res) {
            if (sb.length() == 0 && x == 0) {
                continue; // skip leading zero
            }
            sb.append(x);
        }
        return sb.toString();
    }

}