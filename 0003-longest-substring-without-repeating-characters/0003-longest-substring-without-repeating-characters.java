class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet();
        int left=0,right=0;
        int max =0;
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                max = Math.max(max,set.size());
            }else{
                set.remove(s.charAt(left));
                left++;
                right--;
            }
            right++;
        }
        return max;
    }
}