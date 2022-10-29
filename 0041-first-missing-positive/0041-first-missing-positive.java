class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0||nums[i]>nums.length){
                nums[i] = nums.length+1;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i]);
            if(index>nums.length) continue;
            index--;
            if(nums[index]>0) nums[index] = -1*nums[index];
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return nums.length+1;
    }
}