class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer>map = new HashMap();
        int left=0;
        int right=0;
        int maxrepeat =0;
        int max =0;
        for( right=0;right<s.length();right++){
           char curr = s.charAt(right);
            map.put(curr,map.getOrDefault(curr,0)+1);
                maxrepeat = Math.max(maxrepeat,map.get(curr));
            int currentSizeOfWindow = right - left + 1;
        if(currentSizeOfWindow - maxrepeat > k) {
            char delete = s.charAt(left);
            map.put(delete, map.get(delete) - 1);
            left++;
            currentSizeOfWindow = right - left + 1;
        }

        max = Math.max(max, currentSizeOfWindow);
            
        }
        return max;
    }
}