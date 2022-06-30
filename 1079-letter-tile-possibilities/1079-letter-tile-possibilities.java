class Solution {
    public int numTilePossibilities(String s) {
     Set<String> set = new HashSet();
        boolean[] vis = new boolean[s.length()];
        helper(s,"",set,vis);
        return set.size()-1;
    }
    void helper(String s, String curr,Set<String> set, boolean[] vis){
        set.add(curr);
        for(int i=0;i<s.length();i++){
            if (vis[i] || i > 0 && s.charAt(i) == s.charAt(i-1) && !vis[i - 1])
                continue;
            if(!vis[i]){
                vis[i] = true;
                helper(s,curr+s.charAt(i),set,vis);
                vis[i] = false;
            }
        }
    }
}    
    