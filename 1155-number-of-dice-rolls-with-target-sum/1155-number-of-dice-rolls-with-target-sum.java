class Solution {
    public int numRollsToTarget(int n, int faces, int total) {
         int mod = 1000000007;
        int[][] dp = new int[n+1][total+1];
        dp[0][0] = 1;
        for(int i=1;i<=n;i++){
            for(int t =0;t<=total;t++){
                for(int face=1;face<=faces;face++){
                    if(t<face) continue;
                    else{
                        dp[i][t] = (dp[i][t] + dp[i-1][t-face])%mod;
                    }
                }
            }
        }
        return dp[n][total];
    }
}