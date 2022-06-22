class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n+1][m+1];
        dp[0][0] =1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(j==0) dp[i][0] = 1;
       else if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j]+dp[i-1][j-1];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][m];
    }
}