class Solution { // USING DEQUE , T = O(N), S = O(K)
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n-k+1];

        Deque<Integer>d= new ArrayDeque<>();
        int idx=0;
        for(int i = 0; i<n; i++){
            if(!d.isEmpty()&&d.peekFirst() <= i-k){
                d.pollFirst(); // remove outside element
            }
            while(!d.isEmpty() && nums[d.peekLast()]<=nums[i]){
                d.pollLast();
            }
            d.offerLast(i);
            if(i>=k-1){
                result[idx] = nums[d.peekFirst()];
                idx++;
            }
        }
            return result;
        }
}
// store indices rather than value,remove indices outside current window and remove smaller element from back of deque that can't be maximum if current larger element is there