class Solution {
    public String longestCommonPrefix(String[] s) {
       int n = s.length;
        String curr = s[0];
        for(int i=1;i<n;i++){
            while(s[i].indexOf(curr)!=0){
                curr = curr.substring(0,curr.length()-1);
            }
        }
        return curr;
    }
}