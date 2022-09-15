class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<=1) return true;
        int n = nums.length;
        int steps =0;
        for(int i=0;i<=steps;i++){
           steps = Math.max(steps,nums[i]+i);
            
            if(steps>nums.length-2) return true;
        }
        return false;
    }
}