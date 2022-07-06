class MinStack {
LinkedList<Integer> list;
    public MinStack() {
        list = new LinkedList();
    }
    
    public void push(int val) {
        list.push(val);
    }
    
    public void pop() {
         list.pop();
    }
    
    public int top() {
        return list.getFirst();
    }
    
    public int getMin() {
        PriorityQueue<Integer> pq= new PriorityQueue(list);
        return pq.poll();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */