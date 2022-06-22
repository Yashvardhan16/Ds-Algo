class Solution {
    public int numDistinct(String s, String t) {
       //  int n = s.length();
       //  int m = t.length();
       //  int[][] dp = new int[n+1][m+1];
       //  //empty string can be formed out of empty string
       //  dp[0][0] =1;
       //  for(int i=1;i<=n;i++){
       //      for(int j=0;j<=m;j++){
       //          ////empty string can be formed out of any string
       //          if(j==0) dp[i][0] = 1;
       // else if(s.charAt(i-1)==t.charAt(j-1)){
       //              dp[i][j] = dp[i-1][j]+dp[i-1][j-1];
       //          }else{
       //              dp[i][j] = dp[i-1][j];
       //          }
       //      }
       //  }
       //  return dp[n][m];
        int n = s.length();
        int m = t.length();
        
        int mod = 1000000007;
        
        int[][]dp = new int[n+1][m+1];
        
        for(int i=0; i<=n; i++){
            dp[i][0]=1;
        }
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j]) % mod;
                }else
                    dp[i][j] = dp[i-1][j]% mod;
            }
        }
        
        return dp[n][m];
    }
    }
