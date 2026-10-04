class Solution {// t = O(n), s = O(n)
    private void solve(int left,int right, char[] s){
        if(left>=right) return;
        char temp = s[left];
        s[left]  = s[right];
        s[right] = temp;
        solve(left+1,right-1,s);
    }
    public void reverseString(char[] s) {
        int n = s.length;
        solve(0,n-1,s);
    }
}