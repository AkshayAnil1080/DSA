class MyCircularQueue {
    int q[];
    int front=0,rear=0,size=0;

    public MyCircularQueue(int k) {
        q= new int[k];
        Arrays.fill(q,-1);  // since in constraint its written that value can range from 0 - 1000
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        
        // case where q was empty and ele came at 0th ind - > here front and rear should pt at same location
        if(isEmpty())
        {
            rear=front=0;
            q[rear]=value;
            size++;
            return true;
        }
        rear = (rear+1)%q.length;  //1. unow -> increase the size now -> place value 
        size++;
        q[rear] = value;
        return true;
            
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false; // kuch h hi ni
        
        //we remove from front
        q[front] = -1;
        size--;
        front = (front+1)%q.length;
        
        return true;
        
    }
    
    public int Front() {
        return q[front];
    }
    
    public int Rear() {
        return q[rear];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==q.length;
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