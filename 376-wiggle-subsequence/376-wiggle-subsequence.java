class Solution {
    public int wiggleMaxLength(int[] nums) {
        int up =1;
        int down =1;
        int n = nums.length;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])continue;
            else if(nums[i]>nums[i-1]){
                up = down+1;
            }else{
                down = up+1;
            }
        }
        return Math.max(up,down);
    }
}