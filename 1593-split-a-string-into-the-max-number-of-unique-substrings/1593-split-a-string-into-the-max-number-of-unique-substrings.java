class Solution {
    int max =0;
    public int maxUniqueSplit(String s) {
        helper(s,0,new HashSet());
        return max;
    }
    void helper(String s,int start,Set<String> set){
        if(start==s.length()){
            max = Math.max(max,set.size());
        }
        
        String ans ="";
        for(int i=start;i<s.length();i++){
            ans+=s.charAt(i);
            if(set.contains(ans)) continue;
            set.add(ans);
            helper(s,i+1,set);
            set.remove(ans);
        }
    }
}