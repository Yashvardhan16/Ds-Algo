class MyStack {
LinkedList<Integer> list;
    public MyStack() {
        list = new LinkedList();
    }
    
    public void push(int x) {
        list.push(x);
    }
    
    public int pop() {
         return list.pop();
    }
    
    public int top() {
        return list.getFirst();
    }
    
    public boolean empty() {
        return list.isEmpty();
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