class KthLargest {
  PriorityQueue<Integer> pq=new PriorityQueue();
    int size=0;
    public KthLargest(int k, int[] nums) {
        this.size = k;
        for(int i: nums) {
            pq.add(i);
        }
    }
    
    public int add(int val) {
        pq.add(val);
        while(pq.size()>size) { 
            pq.poll();
        }
        return pq.peek();
    }
}