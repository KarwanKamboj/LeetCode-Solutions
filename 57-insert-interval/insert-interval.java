class Solution { // T = O(n), S = O(n), without sorting
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[][] arr = new int[n+1][];
        boolean insert = false;
        int j = 0;
        for(int i = 0 ; i<n;i++){
            if(!insert && newInterval[0]<intervals[i][0]){
                arr[j++] = newInterval;
                insert = true;
            }
            arr[j++] = intervals[i];
        }
        if(!insert){
            arr[n] = newInterval; // if it is largest of all
        }
       
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