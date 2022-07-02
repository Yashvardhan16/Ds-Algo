class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;
        int min =nums[0];
        int profit =0;
        int max =0;
        for(int i=1;i<n;i++){
            min = Math.min(min,nums[i]);
            profit = nums[i]-min;
            max = Math.max(max,profit);
        }
        return max;
    }
}