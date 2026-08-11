class Solution { // t = o(n), s= o(n)
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer>st=new Stack<>();
        int[] nse = new int[n]; // next smaller element
         for(int i = n-1 ;i>=0 ;i--){
            while(!st.isEmpty()&& heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i] = n;
            }
            else{
                nse[i] = st.peek(); // no smaller element on right
            }
            st.push(i);
        }
        st.clear();
        int[] pse = new int[n]; //  previous smaller element
        for(int i = 0 ;i <n ;i++){
            while(!st.isEmpty()&& heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i] = -1; // no smaller element on left
            }
            else{
                pse[i] = st.peek();
            }
            st.push(i);
        }
        int max = 0 ;
        for(int i = 0 ; i< n ;i++){
            int width = nse[i] - pse[i] -1; // exclude boundaries
            int area = width * heights[i];

            max = Math.max(area,max);
        }
        return max;
    }
}