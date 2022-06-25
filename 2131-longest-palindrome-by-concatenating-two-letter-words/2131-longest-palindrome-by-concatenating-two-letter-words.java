class Solution {
    public int longestPalindrome(String[] words) {
        int[][] count = new int[26][26];
        int ans =0;
        for(String s:words){
            int a = s.charAt(0)-'a';
              int b = s.charAt(1)-'a';
            
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