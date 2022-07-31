class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxB = new int[26];
        for(String s:words2){
            int[] f= new int[26];
            for(char c:s.toCharArray())
            f[c-'a']++;
            
            for(int i=0;i<26;i++)
                maxB[i] = Math.max(maxB[i],f[i]);
            
        }
        List<String> list = new ArrayList();
         for(String s:words1){
            int[] f= new int[26];
            for(char c:s.toCharArray())
            f[c-'a']++;
                
                if(helper(f,maxB))
                    list.add(s);
                
            
         }
        return list;
    }
    boolean helper(int []f,int [] maxB){
        for(int i=0;i<f.length;i++){
            if(f[i]<maxB[i]) return false;
        }
    
    return true;
    }
}