class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count =0;
        int n = nums.length;
        if(n<3) return 0;
        int[] dp = new int [n+1];
        for(int i=2;i<n;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                dp[i] = dp[i-1] +1;
            }
            count+=dp[i];
        }
        return count;
    }
}