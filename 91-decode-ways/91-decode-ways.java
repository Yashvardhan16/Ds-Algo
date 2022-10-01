class Solution {
    public int numDecodings(String s) {
        int n= s.length();
       int[] dp = new int[n+1];
        dp[0] =1;
        dp[1] = s.charAt(0)=='0'?0:1;
        
        for(int i=2;i<=n;i++){
            int singledigit = Integer.valueOf(s.substring(i-1,i));
                        int doubledigit = Integer.valueOf(s.substring(i-2,i));
            
            if(singledigit<=9 && singledigit>=1){
                dp[i]+=dp[i-1];
            }
             if(doubledigit>=10 && doubledigit<=26){
                dp[i]+=dp[i-2];
            }
            
        }
        return dp[n];
    }
}