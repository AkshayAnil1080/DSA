m2 push O(1), pop -O(1)
class MyQueue {
    Stack<Integer> s1; //push
     Stack<Integer> s2; //pop
     int front;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
        front =0;
    }
    
    public void push(int x) {
        if(s1.isEmpty()){
            front=x;
        }
        s1.push(x);
    }
    
    public int pop() {
        //3 cases
        
        // both empty - no ele
        if(s1.isEmpty() && s2.isEmpty())
        return -1;

        // if s2 empty, then only move ele from s1 to s2
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            
        }
        return s2.pop();
    }
    
    public int peek() {
        if(!s2.isEmpty())
            return s2.peek();

            return front;
        
    }
    
    public boolean empty() {
         return s1.isEmpty() && s2.isEmpty();
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
