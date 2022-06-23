class Solution {
    public boolean canJump(int[] nums) {
         int steps =0;
        for(int i=0;i<=steps;i++){
            steps = Math.max(steps,nums[i]+i);
            
            if(steps>=nums.length-1){
                return true;
            }
        }
        return false;
    }
}