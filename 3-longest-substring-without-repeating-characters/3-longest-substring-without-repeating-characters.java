class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int n = s.length();
        int right =0;
        int left =0;
        Set<Character> set = new HashSet();
        int len =0;
       while(right<n){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                len = Math.max(len,set.size());
            }else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return len;
    }
}