class Solution {
    public String reorganizeString(String s) {
        Map<Character,Integer> map =new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        while(pq.size()>1){
            char first = pq.poll();
                char second = pq.poll();
            sb.append(first);
            sb.append(second);
            map.put(first,map.get(first)-1);
             map.put(second,map.get(second)-1);
            if(map.get(first)>0){
                pq.add(first);
            }
            
            if(map.get(second)>0){
                pq.add(second);
            }
            }
            if(!pq.isEmpty()){
                char last = pq.poll();
                if(map.get(last)>1){
                    return "";
                }
                sb.append(last);
            }
        
        return sb.toString();
    }
}