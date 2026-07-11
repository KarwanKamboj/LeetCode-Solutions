class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length ;   //  O(n) extra space
      int temp[] = new int[n];  // O(n) time complexity

    for(int i = 0 ; i < n ;i++){
        int newIndex = (i+k) % n;
        temp[newIndex] = nums[i];
    }
    for(int i = 0 ; i< n ; i++){
        nums[i] = temp[i];
    }
    return;
    }
}