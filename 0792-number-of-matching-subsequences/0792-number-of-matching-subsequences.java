class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count =0;
        Map<String,Integer> map = new HashMap();
        for(String i:words){
            map.put(i,map.getOrDefault(i,0)+1);
        }
    
        char [] c = s.toCharArray();
        
        for(String str:map.keySet()){
            int i=0;
            int j=0;
            while(i<c.length && j<str.length()){
            if(c[i]==str.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
            }
            if(j==str.length()){
                count+=map.get(str);
            }
        }
        return count;
    }
}