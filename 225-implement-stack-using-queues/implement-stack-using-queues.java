class MyStack { // space = O(1) 
    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    public void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {  //t = O(n)
            q.add(q.poll());
        }
    }
    public int pop() {
        return q.poll();  // t = O(1)
    }
    public int top() {
        return q.peek();   // t = O(1)
    }
    public boolean empty() {
        return q.isEmpty();  // t = O(1)
    }
}