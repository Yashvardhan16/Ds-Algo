class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i] = helper(i);
        }
        return dp;
    }
    int helper(int i){
        if(i<=1) return i;
        
        if(i%2==0) return helper(i/2);
        return 1 + helper(i/2);
    }
}