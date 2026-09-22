class Solution { // t = O(n) , s = O(n)
    public void rotate(int[] nums, int k) {
        int n =nums.length;
        int temp[] = new int[n];
      
        for(int i = 0 ;i<n;i++){
            int newIndex = (i+k)%n;
            temp[newIndex] = nums[i];
            newIndex++;
        }
        for(int i = 0 ;i<n;i++){
            nums[i] = temp[i];
        }
        return;
    }
}