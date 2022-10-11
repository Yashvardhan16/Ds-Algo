class Solution {
    public int numTeams(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int count =0;
        
        for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){
                if(nums[i]>nums[j]){
                    dp[i]++;
                    count+=dp[j];
                }
            }
        }
        dp = new int[n];
         for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){
                if(nums[i]<nums[j]){
                    dp[i]++;
                    count+=dp[j];
                }
            }
        }
        return count;
    }
}