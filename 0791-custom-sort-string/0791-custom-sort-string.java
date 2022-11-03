class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
       Map<Character,Integer> map = new HashMap();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:order.toCharArray()){
            if(!map.containsKey(c)) continue;
            
            for(int i=0;i<map.get(c);i++){
                sb.append(c);
            }
            map.remove(c);
        }
        
        for(char c:map.keySet()){
            for(int i=0;i<map.get(c);i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}