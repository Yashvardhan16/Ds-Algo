class Solution {
      Map<String,Boolean> map = new HashMap();
    public boolean wordBreak(String s, List<String> wordDict) {
       if(wordDict.contains(s)) return true;
        
        if(map.containsKey(s)) return map.get(s);
           Set<String> set = new HashSet(wordDict);

        for(int i=0;i<s.length();i++){
            String left = s.substring(0,i);
            if(set.contains(left) && wordBreak(s.substring(i),wordDict)){
                map.put(left,true);
                return true;
            }
        }
        map.put(s,false);
        return false;
    }
}