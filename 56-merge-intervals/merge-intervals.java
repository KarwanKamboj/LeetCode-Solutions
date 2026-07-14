class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if(n<=1) return intervals;
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> res = new ArrayList<>();

        int[] prev = intervals[0];
        for(int i = 1; i < n ;i++){
            int[] curr = intervals[i];
            if(prev[1]>=curr[0]){
                prev[1] = Math.max(prev[1],curr[1]);
            }
            else{
                res.add(prev);
                prev = curr;
            }
        }
        res.add(prev);  // last interval is remaining to add
                        // as updating after adding
        return res.toArray(new int[res.size()][]);
    }
}