class MyQueue {
 LinkedList<Integer> list;
    public MyQueue() {
         list = new LinkedList();
    }
    
    public void push(int x) {
        list.add(x);
    }
    
    public int pop() {
        Integer first = list.getFirst();
        list.removeFirst();
        return first;
    }
    
    public int peek() {
        return list.getFirst();
    }
    
    public boolean empty() {
        return list.isEmpty();
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