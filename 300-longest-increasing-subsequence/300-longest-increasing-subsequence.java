class Solution {
    public int lengthOfLIS(int[] nums) {
        // if(nums.length==1 && nums[0]==1)
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int len =1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
                len = Math.max(len,dp[i]);
            }
        }
        return len;
    }
}