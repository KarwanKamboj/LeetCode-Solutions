class MinStack {
    // approach using sinle stack
    // when a new minimum is pushed, we actually push two values:
    // one is previous min and second is new min, just to handle when pop is done, so that we have previous minimum value
    // s = O(n), (better practical space) and O(1) by every operation
    Stack<Integer>stack;
    int min ;
    public MinStack(){
        stack = new Stack<>();
    } 
    public void push(int value){
        if(stack.isEmpty()){
            stack.push(value);
            min = value;
        }
        else{
            if(value<=min){
                stack.push(min);
                min=value;
            }
            stack.push(value);
        }
    }    
    public void pop(){
        int topp = stack.pop();
        if(topp == min){
            if (stack.isEmpty()){
                return;         // stack became empty
            }
            min = stack.pop(); // restore previous minimum
        }
    }   
    public int top() {
        return stack.peek();
    }    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */