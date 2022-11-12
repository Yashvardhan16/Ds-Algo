class MedianFinder {
        boolean even = true;
    PriorityQueue<Integer> large;
    PriorityQueue<Integer> small;
    public MedianFinder() {
        large = new PriorityQueue(Collections.reverseOrder());
        small = new PriorityQueue();
    }
    
    public void addNum(int num) {
        if(even){
            small.add(num);
            large.add(small.poll());
        }else{
            large.add(num);
            small.add(large.poll());
        }
        if(even==true) even =false;
        else even =true;
    }
    
    public double findMedian() {
        if(even){
            return (small.peek()+large.peek())/2.0;
        }else{
            return large.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */