class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList();
        for(String word:words){
            if(match(word,pattern)){
                list.add(word);
            }
        }
        return list;
    }
    boolean match(String word,String pattern){
        if(word.length()!=pattern.length()) return false;
        Map<Character,Character> map1 = new HashMap();
                Map<Character,Character> map2 = new HashMap();
        
        for(int i=0;i<word.length();i++){
            char c= word.charAt(i);
            char d = pattern.charAt(i);
            
            if(!map1.containsKey(c)){
                map1.put(c,d);
            }
            if(!map2.containsKey(d)){
                map2.put(d,c);
            }
            if(map1.get(c) !=d || map2.get(d)!=c){
                return false;
            }
        }
return true;
    }
}