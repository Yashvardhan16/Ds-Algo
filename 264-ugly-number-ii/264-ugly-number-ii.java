class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n+1];
        dp[0] =1;
        int count2=0,count3=0,count5=0;
        
        for(int i=1;i<=n;i++){
            dp[i] = Math.min(2*dp[count2],Math.min(3*dp[count3],5*dp[count5]));
            
            if(dp[i] == 2*dp[count2]){
                count2++;
            }
            if(dp[i] == 3*dp[count3]){
                count3++;
            }
            if(dp[i] == 5*dp[count5]){
                count5++;
            }
        }
        return dp[n-1];
    }
}