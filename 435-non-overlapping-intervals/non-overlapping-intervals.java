class Solution {//greedy algo, t = O(n),s = O(1)
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int end = intervals[0][1]; // end of each interval
        int count=0;
        for(int i = 1; i<intervals.length;i++){
            if(intervals[i][0]<end){ // starting of inteval is less then end of previous
                count++;
            }else{
                end = intervals[i][1];
            }
        }
        return count;
    }
}