class StockSpanner { // t= O(N), s = O(N)
    Stack<int[]> st;
    int index =0;
    public StockSpanner() {
        st = new Stack<>();
    }
    public int next(int price) {
        while(!st.isEmpty() && st.peek()[0]<=price){// Remove smaller or equal prices
            st.pop();
        }
        int span;
        if(st.isEmpty()){
            span=index+ 1;
        }else{
            span=index - st.peek()[1];
        }
        st.push(new int[]{price, index});
        index++;
        return span;
    }
}