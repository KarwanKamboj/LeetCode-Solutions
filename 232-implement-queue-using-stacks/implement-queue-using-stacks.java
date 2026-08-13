class MyQueue {//USING ONE STACK
    // one stack + recursion is followed but it is less practical
    Stack<Integer>st;
    public MyQueue() {
        st = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x); // o(1)
    }
    
    public int pop() {
        if(st.size()==1){
            return st.pop();
        }
        int x = st.pop();  // o(n)
        int ans = pop();
        st.push(x);
        return ans ;
    }
    //The recursion keeps popping and when it reaches to the element we want it stores in ans and then recursion come back and puts elements again
    public int peek() {
        if(st.size()==1){  // o(1)
            return st.peek();
        }
        int x = st.pop();
        int ans = peek();
        st.push(x);
        return ans;
        
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */