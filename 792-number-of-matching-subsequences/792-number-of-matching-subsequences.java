class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<String,Integer> map = new HashMap();
        
        for(int i=0;i<words.length;i++){
                map.put(words[i],map.getOrDefault(words[i],0)+1);
            
        }
     int ans =0;
        char[] c= s.toCharArray();
        
        for(String s1:map.keySet()){
            char[] temp = s1.toCharArray();
            int i=0;
            int j=0;
            
            while(i<c.length && j<temp.length){
                if(c[i]==temp[j]){
                    i++;
                    j++;
                }else{
                    i++;
                }
            }
            if(j==temp.length){
                ans+= map.get(s1);
            }
        }
        return ans;
    }
}