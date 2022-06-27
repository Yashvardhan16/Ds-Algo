class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        if(s.equals(t)) return true;
        Map<Character,Integer> map = new HashMap();
        
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
        }
        
        for(char i:map.keySet()){
            if(map.get(i)!=0) return false;
         }
        return true;
    }
}