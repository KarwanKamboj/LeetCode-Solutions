class Solution {
    public int minInsertions(String s) {
       int count  = 0; // ')' missing count  while traversing
       int ans =0; // insertion required while traversing
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(count%2 ==1){
                    ans++;
                    count--;
                }
                count+=2;
            }else{
                count--;
                if(count<0){
                    ans++;
                    count = 1 ;
                }
            }
        }
        return ans + count;
    }
}