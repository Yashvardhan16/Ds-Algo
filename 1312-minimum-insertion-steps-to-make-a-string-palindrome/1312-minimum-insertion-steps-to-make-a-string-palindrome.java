class Solution {
    public int minInsertions(String s) {
         int n  = s.length();
        StringBuilder sb = new StringBuilder();
      sb.append(s);
        sb.reverse();
              int[][] dp = new int[n+1][n+1];
         for(int i=1;i<=n;i++){
            for(int j=1;j<=sb.length();j++){
                   if(i==0||j==0){
                    dp[i][j] = 0;
                }
               else if(s.charAt(i-1)==sb.charAt(j-1)){
                    dp[i][j] =1+ dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return n -dp[n][n];
    }
}