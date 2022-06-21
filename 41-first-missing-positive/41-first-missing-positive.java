class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0 || nums[i]> nums.length){
                nums[i] = nums.length+1;
            }
        }
        //3,4,5,1
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i]);
            if(index>nums.length) continue;
            index--;
            //2,3,5,1
            if(nums[index]>0) nums[index] *= -1;
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) return i+1;
        }
        return nums.length+1;
    }
}