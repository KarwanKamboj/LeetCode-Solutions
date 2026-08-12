class Solution {
    public int trap(int[] height) {
        // t= O(N), S = O(N) USING STACK
        int n = height.length;
        int water  = 0;
        Stack<Integer>st=new Stack<>();
        for(int i = 0 ; i<n;i++){
            while(!st.isEmpty() && height[i]>height[st.peek()]){
                int bottom = st.pop();
                if(st.isEmpty()) break;
                int left = st.peek();
                int width = i-left - 1; // only walls
                int h = Math.min(height[left],height[i]) - height[bottom];// height of empty space
                water += width * h;
            }
            st.push(i);
        }
        return water;
    }
}