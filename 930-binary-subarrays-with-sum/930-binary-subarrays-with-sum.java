class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int count =0;
        int[] ans =new int[n+1];
        ans[0] =1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
          
            if(sum>=goal){
               count+= ans[sum-goal];
            }
             ans[sum]++;
        }
        return count;
    }
}