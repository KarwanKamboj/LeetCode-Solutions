class MinStack {
    // two stack approach ,space = O(n)
    Stack<Integer>stack;
    Stack<Integer>minStack;
    public MinStack() {
        stack=new Stack();
        minStack=new Stack();
    }    
    public void push(int value) {
        stack.push(value);
        if(minStack.isEmpty()){      // push() → O(1)
            minStack.push(value);
        }
        else{
            minStack.push(Math.min(value,minStack.peek()));
        }
    }
    public void pop() {
        stack.pop();    //pop() → O(1)
        minStack.pop();
    }    
    public int top() {     // top() → O(1)
        return stack.peek();
    }
    public int getMin() {
        return minStack.peek();  //getMin() → O(1)
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