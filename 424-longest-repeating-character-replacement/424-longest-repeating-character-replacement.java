class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer>map = new HashMap();
        int left=0;
        int right=0;
        int maxrepeat =0;
        int max =0;
        for( right=0;right<s.length();right++){
           char curr = s.charAt(right);
            if(!map.containsKey(curr)){
                map.put(curr,0);
            }
            map.put(curr,map.get(curr)+1);
                maxrepeat = Math.max(maxrepeat,map.get(curr));
            if(right-left+1-maxrepeat>k){
                char delete = s.charAt(left);
                map.put(delete,map.get(delete)-1);
                left++;
            }
            max = Math.max(max,right-left+1);
            
        }
        return max;
    }
}