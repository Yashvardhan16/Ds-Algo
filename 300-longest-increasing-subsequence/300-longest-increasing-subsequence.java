class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==1&&nums[0]==0) return 1;
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,1);
        int max =0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                    
                } 
                max =Math.max(max,dp[i]);
            }
        }
        return max;
    }
}