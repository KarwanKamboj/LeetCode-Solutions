class Solution { // greedy algo , t = O(n) , s = O(1)
    public int leastInterval(char[] tasks, int n) {
        int freq[] = new  int[26];
        int max = 0 ;
        for(int i = 0 ;i <tasks.length;i++){
            freq[tasks[i]-'A']++;
            max = Math.max(freq[tasks[i]-'A'],max);
        }
        int ans = (max-1)*(n+1);  // gap * next task itself with 1 unit time
        for(int i =0 ; i<26;i++){
            if(freq[i]==max){
                ans++;
            }
        }
        return Math.max(ans,tasks.length);
    }
}