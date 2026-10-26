class Solution {
    public List<Integer> partitionLabels(String s) {
        int last[] = new int[26];
        for(int i = 0 ; i<s.length();i++){
            last[s.charAt(i)-'a'] = i;
        }
        int start=0,end=0;
        List<Integer>ans = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            end=Math.max(end,last[s.charAt(i)-'a']);
            if(end==i){
                ans.add(end-start+1);
                start = end+1;
                end = 0;
            }
        }
        return ans;
    }
}