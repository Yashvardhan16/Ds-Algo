class Solution {
    public int titleToNumber(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int temp = (s.charAt(i)-'A')+1;
            ans= ans*26+temp;
            }
        return ans;
    }
}