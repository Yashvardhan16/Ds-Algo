class Solution {
    public int characterReplacement(String s, int k) {
        int n =s.length();
        Map<Character,Integer> map = new HashMap();
        int max =0;
            int left =0;
    int maxrepeat =0;
            int curr =0;
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
         maxrepeat = Math.max(maxrepeat,map.get(s.charAt(i)));
             curr= i-left+1;
            if(curr-maxrepeat>k){
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
                left++;
                curr = i-left+1;
            }
            max = Math.max(max,curr);
        }
        return max;
    }
}