class Solution { // T = O(nlogn), S = O(n)
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[][] arr = new int[n+1][];
        for(int i = 0 ; i<n;i++){
            arr[i] = intervals[i];
        }
        arr[n] = newInterval;
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> lst = new ArrayList<>();
        int prev[] = arr[0];
        for(int i = 1;i<n+1;i++){
            int curr[] = arr[i];
            if(prev[1]>=curr[0]){
                prev[1] = Math.max(prev[1],curr[1]);
            }else{
                lst.add(prev);
                prev = curr;
            }
        }
        lst.add(prev);
        return lst.toArray(new int[lst.size()][]);
    }
}