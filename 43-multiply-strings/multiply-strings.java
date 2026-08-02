class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int m = num1.length();
        int n = num2.length();
        int[] res = new int[m + n];

        // Outer loop on num2
        for (int i = n - 1; i >= 0; i--) {
            // Inner loop on num1
            for (int j = m - 1; j >= 0; j--) {
                int mul = (num2.charAt(i) - '0') * (num1.charAt(j) - '0');

                int left=i+j;
                int right=i+j+1;

                int sum = mul+res[right];
                res[right]=sum%10;
                res[left]=res[left]+sum/10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int digit : res) {
            if (sb.length()==0 && digit==0) {
                continue;
            }
            sb.append(digit);
        }
        return sb.toString();
    }
}