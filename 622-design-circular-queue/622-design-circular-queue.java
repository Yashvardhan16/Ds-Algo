class MyCircularQueue {
    LinkedList<Integer> list;
    int size =0;
    public MyCircularQueue(int k) {
        list  = new LinkedList();
        this.size=k;
    }
    
    public boolean enQueue(int value) {
       if(list.size() >= size) return false;
       list.add(list.size(),value); 
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        list.remove(0); 
        return true;   
    }
    
    public int Front() {
if(isEmpty()) return -1;
        return list.get(0);   
    }
    
    public int Rear() {
         if(isEmpty()) return -1;
        return list.get(list.size()-1);
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public boolean isFull() {
        return list.size()==size;
    }
}