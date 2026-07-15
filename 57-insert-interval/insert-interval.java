class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int [][]arr = new int[n+1][];

        for (int i = 0; i < n; i++) {
            arr[i] = intervals[i];
        }
        arr[n]= newInterval;
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));

        List<int[]>ans = new ArrayList<>();
        int[] prev = arr[0];
        for(int i = 1 ; i<n+1; i++){
            int[] curr = arr[i];
            if(prev[1]>=curr[0]){
                prev[1]= Math.max(prev[1],curr[1]);
            }
            else{
                ans.add(prev);
                prev = curr;
            }
        }
        ans.add(prev);
        return ans.toArray(new int[ans.size()][]);
    }
}