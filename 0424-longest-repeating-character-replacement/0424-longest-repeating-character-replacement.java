class Solution {
    public int characterReplacement(String s, int k) {
        
        
        Map<Character,Integer> map = new HashMap();
        
        int right=0,left=0,max=0;
        int curr =0;
        int ans= 0;
        while(right<s.length()){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            max = Math.max(max,map.get(s.charAt(right)));
            
            curr = right-left+1;
            if(curr-max>k){
               map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
                left++;
              curr =right-left+1;
            }
            right++;
              ans= Math.max(ans,curr);
            
        }
        return ans;
    }
}