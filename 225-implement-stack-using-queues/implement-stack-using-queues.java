class MyStack { // USING TWO QUEUES
    Queue<Integer>q1; // main queue
    Queue<Integer>q2; // temp queue
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {     // O(n)
        q2.offer(x);   
        while(!q1.isEmpty()){//move all elements from q1 to q2
            q2.offer(q1.poll());
        }
        Queue<Integer>temp=q1;
        q1=q2;
        q2=temp ;  // now q2 is empty
        return;

    }
    
    public int pop() {  //O(1)
        return q1.poll();
    }
    
    public int top() { //O(1)
        return q1.peek();
    }
    
    public boolean empty() { //O(1)
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */