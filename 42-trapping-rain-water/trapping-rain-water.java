class Solution { // T = O(N) , S = O(1)
    public int trap(int[] height) {

        Stack<Integer> st = new Stack<>();
        int water = 0;

        for (int i = 0; i < height.length; i++) {

            while (!st.isEmpty() && height[i] > height[st.peek()]) {

                int bottom = st.pop();

                if (st.isEmpty()) {
                    break;
                }

                int left = st.peek();

                int width = i - left - 1;

                int h = Math.min(height[left], height[i])
                        - height[bottom];

                water += width * h;
            }

            st.push(i);
        }

        return water;
    }
}