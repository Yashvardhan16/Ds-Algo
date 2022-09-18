class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
       if(s.equals(t)) return true;
        
        int[] c1= new int[26];
        for(char c:s.toCharArray()){
            c1[c-'a']++;
        }
        for(char c:t.toCharArray()){
            c1[c-'a']--;
        }
        for(int i=0;i<s.length();i++){
            if(c1[s.charAt(i)-'a']>0) return false;
        }
        return true;
    }
}