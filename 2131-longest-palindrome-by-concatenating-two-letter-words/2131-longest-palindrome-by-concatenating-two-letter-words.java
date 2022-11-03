class Solution {
    public int longestPalindrome(String[] words) {
        int n = words.length;
        int[][] count = new int[26][26];
        int ans =0;
        for(String i:words){
            int a = i.charAt(0)-'a';
            int b = i.charAt(1) -'a';
            if(count[b][a]>0){
                ans+=4;
                count[b][a]--;
            }else{
                count[a][b]++;
            }
        }
        for(int i=0;i<26;i++){
            if(count[i][i]>0){
                ans+=2;
                break;
            }
        }
        return ans;
    }
}