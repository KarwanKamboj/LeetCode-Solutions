class MyCircularQueue { // T = O(1) per operation, s = O(1)
    int arr[];
    int front;
    int rear;
    int size;
    public MyCircularQueue(int k) {
        arr = new int[k];
        front= -1;
        rear = -1;
        size = k;
    }
    
    public boolean enQueue(int value) {
        if(front == (rear+1)%size){               // O(1)
            return false; // q is full
        }
        // insert element at rear end
        if(front == -1){ // first element to be inserted
            front = 0;
            rear = 0 ;
        }else{
            rear = (rear+1)%size;
        }
        arr[rear] = value;
        return true;
    }    
    public boolean deQueue() {
        if(front == -1){                       // O(1)
            return false; // q is empty
        }
        // remove elemnet from front end
        if(front == rear){
            front = -1;  // last element is removed
            rear = -1;
        }else{
            front = (front +1)%size;
        }
        return true;
    }    
    public int Front() {
        if(isEmpty()) return -1;      // O(1)
        return arr[front];
    }    
    public int Rear() {
        if(isEmpty()) return -1;
        return arr[rear];                 // O(1)
    }    
    public boolean isEmpty() {
        return front == -1;
    }
    public boolean isFull() {               // O(1)
        return front == (rear+1)%size; //check is it full
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */