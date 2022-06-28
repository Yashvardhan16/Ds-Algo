class Solution {
    public int minDeletions(String s) {
        if(s.length()==0) return 0;
        Map<Character,Integer> map = new HashMap();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(char i:map.keySet()){
            pq.add(map.get(i));
        }
        if(pq.size()==1) return 0;
        int delete=0;
       while(pq.size()>1){
           int top = pq.poll();
           
           if(top==pq.peek()){
               if(top-1>0){
                   pq.add(top-1);
               }
               delete++;
           }
       }
        return delete;
    }
}