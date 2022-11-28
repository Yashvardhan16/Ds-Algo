class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if(n<=2) return 0;
        int[] dp = new int[n+1];
        dp[0] = 0;
        int count =0;
        for(int i=1;i<n-1;i++){
           
                if(nums[i]-nums[i-1]==nums[i+1]-nums[i]){
                    dp[i] = 1+dp[i-1];
                }
               count+=dp[i];
            
        }
        return count;
    }
}