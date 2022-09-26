class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int ans =nums[0];
        for(int i=1;i<n;i++){
            int prev_max = max;
      max = Math.max(nums[i],Math.max(max*nums[i],min*nums[i]));
     min = Math.min(nums[i],Math.min(min*nums[i],prev_max*nums[i]));
            ans =Math.max(ans,max);
        }
        return ans;
    }
}