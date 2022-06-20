class Solution {
    public int minimumLengthEncoding(String[] words) {
        Set<String> set = new HashSet(Arrays.asList(words));
    
    for(String w:words){
        for(int i=1;i<w.length();i++){
            set.remove(w.substring(i));
        }
    }    
       
        int count =0;
        for(String word:set){
                count += word.length()+1;
            
        }
        return count;
    }
}