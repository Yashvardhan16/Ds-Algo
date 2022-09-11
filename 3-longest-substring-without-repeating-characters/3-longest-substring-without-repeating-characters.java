class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet();
        int n = s.length();
        int i=0;
        int left =0;
        int max =0;
        while(i<n){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                max = Math.max(max,set.size());
                i++;
            }else if(set.contains(s.charAt(left))){
                set.remove(s.charAt(left));
                left++;
            }
            
        }
        return max;
    }
}