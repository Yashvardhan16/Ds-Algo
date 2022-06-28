class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[n-1] - nums[0];
        int min = nums[0]+k;
        int max = nums[n-1]-k;
        for(int i=0;i<n-1;i++){
            int max_new =Math.max(max,nums[i]+k);
            int min_new =Math.min(min,nums[i+1]-k);
            ans = Math.min(ans,max_new-min_new);
        }
        return ans;
    }
}