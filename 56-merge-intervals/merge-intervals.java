class Solution {// t =O(nlog(n)), s = O(n)
    public int[][] merge(int[][] intervals) {
        int  n = intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>ans = new ArrayList<>();
        int prev[] = intervals[0];
        for(int i=1; i<n;i++){
            int curr[] = intervals[i];
            if(prev[1]>=curr[0]){
                prev[1] = Math.max(prev[1],curr[1]);
            }else{
                ans.add(prev);
                prev = curr;
            }
        }
        ans.add(prev);
        return ans.toArray(new int[ans.size()][]);//each int[] already exists inside the list
    }
} 